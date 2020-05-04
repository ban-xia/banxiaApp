package banxia.org.controller;

import banxia.org.pojo.Record;
import banxia.org.service.RecordService;
import banxia.org.utils.ResultUtils;
import banxia.org.vo.RecordVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author xiexin
 * @create 2020-04-20 5:27 下午
 * @description
 */
@RestController
@RequestMapping("/record")
@Api(value = "病历管理接口", tags = {"病历管理接口"})
public class RecordController {

    @Autowired
    private RecordService recordService;


    @ApiOperation(value = "查询全部病历情况")
    @ApiImplicitParam(name = "userId", value = "用户Id", required = true,
            dataType = "String", paramType = "query")
    @GetMapping("/list")
    public ResultUtils list(String userId) {
        return ResultUtils.ok(recordService.queryDoctorList(userId));
    }

    @ApiOperation(value = "查询病历详情")
    @ApiImplicitParam(name = "recId", value = "病历Id", required = true,
            dataType = "String", paramType = "query")
    @GetMapping("/detail")
    public ResultUtils detail(String recId) {

        if (StringUtils.isBlank(recId)) {
            return ResultUtils.errorMsg("用户id不能为空");
        }

        RecordVO record = recordService.queryRecordById(Integer.parseInt(recId));

        if (record == null) {
            return ResultUtils.errorMsg("当前病历不存在");
        }

        return ResultUtils.ok(record);
    }

    @ApiOperation(value = "添加病历")
    @PostMapping("/save")
    public ResultUtils save(@RequestBody Record record) {

        return ResultUtils.ok(recordService.saveRecord(record));
    }

    @ApiOperation(value = "修改病历")
    @PostMapping("/update")
    public ResultUtils update(@RequestBody Record record) {
        return ResultUtils.ok(recordService.updateRecord(record));
    }

    @ApiOperation(value = "删除病历")
    @PostMapping("/delete")
    @ApiImplicitParam(name = "recId", value = "病历Id", required = true,
            dataType = "String", paramType = "query")
    public ResultUtils delete(@RequestBody String recId) {
        return ResultUtils.ok(recordService.deleteRecord(Integer.parseInt(recId)));
    }
}
