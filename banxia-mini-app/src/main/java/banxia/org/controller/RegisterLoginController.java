package banxia.org.controller;

import banxia.org.pojo.User;
import banxia.org.service.DoctorService;
import banxia.org.service.UserService;
import banxia.org.utils.MD5Utils;
import banxia.org.utils.ResultUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.NoSuchAlgorithmException;

/**
 * @author: 紫苏
 * @date: 2020/5/5 上午12:11
 * @description:
 */
@RestController
@Api(value = "用户注册登录的接口", tags = {"注册和登录接口"})
public class RegisterLoginController extends BasicController {

    @Autowired
    private UserService userService;

    @Autowired
    private DoctorService doctorService;

    @ApiOperation(value = "用户注册")
    @PostMapping("/user/regist")
    public ResultUtils regist(String phone, String password) throws NoSuchAlgorithmException {

        User user = new User();
        user.setUserPhone(phone);
        user.setUserPass(password);

        if (StringUtils.isBlank(user.getUserPhone()) || StringUtils.isBlank(user.getUserPass())) {
            return ResultUtils.errorMsg("手机号和密码不能为空");
        }

        if (!userService.queryPhoneIsExist(user.getUserPhone())) {
            user.setUserPass(MD5Utils.getMD5Str(user.getUserPass()));
            userService.saveUser(user);
        } else {
            return ResultUtils.errorMsg("用户名已存在");
        }

        user.setUserPass("");

//        return ResultUtils.ok(setUserRedisSessionToken(user));
        return ResultUtils.ok(0);
    }

}
