package banxia.org.controller;

import banxia.org.pojo.Doctor;
import banxia.org.pojo.Duty;
import banxia.org.service.DutyService;
import banxia.org.utils.ResultUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author xiexin
 * @create 2020-04-20 5:26 下午
 * @description
 */
@RestController
@RequestMapping("/duty")
@Api(value = "值班管理接口", tags = {"值班管理接口"})
public class DutyController {

    @Autowired
    private DutyService dutyService;

    @ApiOperation(value = "查询全部值班情况")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "depId", value = "科室Id", required = true,
                            dataType = "String", paramType = "query"),
                    @ApiImplicitParam(name = "noon", value = "时段", required = true,
                            dataType = "int", paramType = "query")
            }
    )
    @GetMapping("/list")
    public ResultUtils list(String depId, int noon) {
        return ResultUtils.ok(dutyService.queryDutyList(Integer.parseInt(depId), noon));
    }

    @ApiOperation(value = "查询值班详情")
    @ApiImplicitParam(name = "dutyId", value = "值班Id", required = true,
            dataType = "String", paramType = "query")
    @GetMapping("/detail")
    public ResultUtils detail(String dutyId) {

        if (StringUtils.isBlank(dutyId)) {
            return ResultUtils.errorMsg("用户id不能为空");
        }

        Duty duty = dutyService.queryDutyById(Integer.parseInt(dutyId));

        if (duty == null) {
            return ResultUtils.errorMsg("当前值班不存在");
        }

        return ResultUtils.ok(duty);
    }

    @ApiOperation(value = "添加值班")
    @PostMapping("/save")
    public ResultUtils save(
            String depId,
            String docId,
            String datetime,
            int noon
    ) {

        return ResultUtils.ok(dutyService.saveDuty(Integer.parseInt(depId), Integer.parseInt(docId), datetime, noon));
    }

    @ApiOperation(value = "修改值班")
    @PostMapping("/update")
    public ResultUtils update(
            String depId,
            String datetime,
            int noon
    ) {
        return ResultUtils.ok(dutyService.updateDuty(Integer.parseInt(depId), datetime, noon));
    }

    @ApiOperation(value = "删除值班")
    @PostMapping("/delete")
    @ApiImplicitParam(name = "dutyId", value = "医生Id", required = true,
            dataType = "String", paramType = "query")
    public ResultUtils delete(@RequestBody String dutyId) {
        return ResultUtils.ok(dutyService.deleteDuty(Integer.parseInt(dutyId)));
    }
}
