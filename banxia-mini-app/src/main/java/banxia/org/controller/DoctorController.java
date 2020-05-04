package banxia.org.controller;

import banxia.org.pojo.Department;
import banxia.org.pojo.Doctor;
import banxia.org.service.DoctorService;
import banxia.org.utils.ResultUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
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
@RequestMapping("/doctor")
@Api(value = "医生管理接口", tags = {"医生管理接口"})
public class DoctorController extends BasicController {

    @Autowired
    private DoctorService doctorService;

    @ApiOperation(value = "查询全部医生")
    @GetMapping("/list")
    public ResultUtils list(
            Integer depId,
            String name,
            Integer page,
            String datetime
    ) {

        if (page == null) {
            page = 1;
        }

        return ResultUtils.ok(doctorService.queryDoctorList(depId, name, page, PAGE_SIZE, datetime));
    }

    @ApiOperation(value = "查询医生详情")
    @ApiImplicitParam(name = "docId", value = "医生Id", required = true,
            dataType = "String", paramType = "query")
    @GetMapping("/detail")
    public ResultUtils detail(String docId) {

        if (StringUtils.isBlank(docId)) {
            return ResultUtils.errorMsg("用户id不能为空");
        }

        Doctor doctor = doctorService.queryDoctorById(Integer.parseInt(docId));

        if (doctor == null) {
            return ResultUtils.errorMsg("医生不存在");
        }

        return ResultUtils.ok(doctor);
    }

    @ApiOperation(value = "添加医生")
    @PostMapping("/save")
    public ResultUtils save(@RequestBody Doctor doctor) {
        return ResultUtils.ok(doctorService.saveDoctor(doctor));
    }

    @ApiOperation(value = "修改医生")
    @PostMapping("/update")
    public ResultUtils update(@RequestBody Doctor doctor) {
        return ResultUtils.ok(doctorService.updateDoctor(doctor));
    }

    @ApiOperation(value = "删除医生")
    @GetMapping("/delete")
    @ApiImplicitParam(name = "docId", value = "医生Id", required = true,
            dataType = "String", paramType = "query")
    public ResultUtils delete(String docId) {
        return ResultUtils.ok(doctorService.deleteDoctor(Integer.parseInt(docId)));
    }
}
