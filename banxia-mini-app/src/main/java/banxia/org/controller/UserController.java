package banxia.org.controller;

import banxia.org.pojo.Treat;
import banxia.org.pojo.User;
import banxia.org.service.UserService;
import banxia.org.utils.ResultUtils;
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
@RequestMapping("/user")
@Api(value = "用户管理接口", tags = {"用户管理接口"})
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "查询全部用户情况")
    @GetMapping("/list")
    public ResultUtils list() {
        return ResultUtils.ok(userService.queryTreatList());
    }

    @ApiOperation(value = "查询用户详情")
    @ApiImplicitParam(name = "userId", value = "用户Id", required = true,
            dataType = "String", paramType = "query")
    @GetMapping("/detail")
    public ResultUtils detail(String userId) {

        if (StringUtils.isBlank(userId)) {
            return ResultUtils.errorMsg("用户id不能为空");
        }

        User user = userService.queryUserById(Integer.parseInt(userId));

        if (user == null) {
            return ResultUtils.errorMsg("当前用户不存在");
        }

        return ResultUtils.ok(user);
    }

    @ApiOperation(value = "添加诊疗")
    @PostMapping("/save")
    public ResultUtils save(@RequestBody User user) {

        return ResultUtils.ok(userService.saveUser(user));
    }

    @ApiOperation(value = "修改诊疗")
    @PostMapping("/update")
    public ResultUtils update(@RequestBody User user) {
        return ResultUtils.ok(userService.updateUser(user));
    }

    @ApiOperation(value = "删除诊疗")
    @PostMapping("/delete")
    @ApiImplicitParam(name = "recId", value = "诊疗Id", required = true,
            dataType = "String", paramType = "query")
    public ResultUtils delete(@RequestBody String userId) {
        return ResultUtils.ok(userService.deleteUser(Integer.parseInt(userId)));
    }
}
