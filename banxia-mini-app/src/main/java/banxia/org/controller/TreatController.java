package banxia.org.controller;

import banxia.org.pojo.Record;
import banxia.org.pojo.Treat;
import banxia.org.service.TreatService;
import banxia.org.utils.ResultUtils;
import banxia.org.vo.TreatVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author xiexin
 * @create 2020-04-20 5:28 下午
 * @description
 */
@RestController
@RequestMapping("/treat")
@Api(value = "诊治管理接口", tags = {"诊治管理接口"})
public class TreatController {

    @Autowired
    private TreatService treatService;

    @ApiOperation(value = "查询全部诊疗情况")
    @ApiImplicitParam(name = "treatStatus", value = "诊疗状态",
            dataType = "String", paramType = "query")
    @GetMapping("/list")
    public ResultUtils list(String treatStatus) {
        return ResultUtils.ok(treatService.queryTreatList(treatStatus));
    }

    @ApiOperation(value = "查询诊疗详情")
    @ApiImplicitParam(name = "treatId", value = "诊疗Id", required = true,
            dataType = "String", paramType = "query")
    @GetMapping("/detail")
    public ResultUtils detail(String treatId) {

        if (StringUtils.isBlank(treatId)) {
            return ResultUtils.errorMsg("诊疗id不能为空");
        }

        TreatVO treat = treatService.queryTreatById(Integer.parseInt(treatId));

        if (treat == null) {
            return ResultUtils.errorMsg("当前诊疗不存在");
        }

        return ResultUtils.ok(treat);
    }

    @ApiOperation(value = "添加诊疗")
    @PostMapping("/save")
    public ResultUtils save(@RequestBody Treat treat) {

        return ResultUtils.ok(treatService.saveTreat(treat));
    }

    @ApiOperation(value = "修改诊疗")
    @GetMapping("/update")
    public ResultUtils update(String treatId, String status) {
        return ResultUtils.ok(treatService.updateTreat(treatId, status));
    }

    @ApiOperation(value = "删除诊疗")
    @PostMapping("/delete")
    @ApiImplicitParam(name = "recId", value = "诊疗Id", required = true,
            dataType = "String", paramType = "query")
    public ResultUtils delete(@RequestBody String treatId) {
        return ResultUtils.ok(treatService.deleteTreat(Integer.parseInt(treatId)));
    }
}
