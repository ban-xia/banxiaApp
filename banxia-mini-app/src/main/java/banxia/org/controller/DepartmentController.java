package banxia.org.controller;

import banxia.org.pojo.Department;
import banxia.org.service.DepartmentService;
import banxia.org.utils.ResultUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.NoSuchAlgorithmException;

/**
 * @author xiexin
 * @create 2020-04-20 5:24 下午
 * @description
 */
@RestController
@RequestMapping("/department")
@Api(value = "部门管理相关接口", tags = {"部门管理相关接口"})
public class DepartmentController extends BasicController {

    @Autowired
    private DepartmentService departmentService;

    @ApiOperation(value = "查询全部部门")
    @GetMapping("/list")
    public ResultUtils list() {
        return ResultUtils.ok(departmentService.queryDepartmentList());
    }

    @ApiOperation(value = "查询部门详情")
    @ApiImplicitParam(name = "depId", value = "部门Id", required = true,
            dataType = "String", paramType = "query")
    @GetMapping("/detail")
    public ResultUtils detail(String depId) {

        if (StringUtils.isBlank(depId)) {
            return ResultUtils.errorMsg("用户id不能为空");
        }

        Department department = departmentService.queryDepartmentById(Integer.parseInt(depId));

        if (department == null) {
            return ResultUtils.errorMsg("部门不存在");
        }

        return ResultUtils.ok(department);
    }

    @ApiOperation(value = "添加部门")
    @PostMapping("/save")
    public ResultUtils save(@RequestBody Department department) {

        if (!departmentService.queryDepartServiceIsExist(department.getDepNum(), department.getDepName())) {
            departmentService.saveDepartment(department);
        } else {
            return ResultUtils.errorMsg("部门重复");
        }

        return ResultUtils.ok(true);
    }

    @ApiOperation(value = "修改部门")
    @PostMapping("/update")
    public ResultUtils update(@RequestBody Department department) {
        return ResultUtils.ok(departmentService.updateDepartment(department));
    }



}
