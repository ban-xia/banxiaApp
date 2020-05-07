package banxia.org.controller;

import banxia.org.exception.BizException;
import banxia.org.pojo.Doctor;
import banxia.org.pojo.User;
import banxia.org.service.DoctorService;
import banxia.org.service.UserService;
import banxia.org.utils.MD5Utils;
import banxia.org.utils.ResultUtils;
import banxia.org.vo.DoctorVO;
import banxia.org.vo.UserVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.NoSuchAlgorithmException;
import java.util.UUID;

import static banxia.org.interceptor.MiniInterceptor.USER_REDIS_SESSION;

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

        return ResultUtils.ok(setUserRedisSessionToken(user));
    }

    @ApiOperation(value = "用户登录")
    @PostMapping("/user/login")
    public ResultUtils login(String phone, String password) throws NoSuchAlgorithmException {

        User user = new User();
        user.setUserPhone(phone);
        user.setUserPass(password);

        if (StringUtils.isBlank(user.getUserPhone()) || StringUtils.isBlank(user.getUserPass())) {
            return ResultUtils.errorMsg("用户名和密码不能为空");
        }

        try {
            User res = userService.queryUserIsExist(user.getUserPhone(), user.getUserPass());
            if (res != null) {
                res.setUserPass("");
                return ResultUtils.ok(setUserRedisSessionToken(res));
            }
        } catch (BizException e) {
            return ResultUtils.errorMsg(e.getMessage());
        }

        return ResultUtils.errorException("通信错误");

    }


    @ApiOperation(value = "医生登录")
    @PostMapping("/doctor/login")
    public ResultUtils docLogin(String docNum, String password) throws NoSuchAlgorithmException {

        Doctor doctor = new Doctor();
        doctor.setDocNum(docNum);
        doctor.setDocPassword(password);

        if (StringUtils.isBlank(doctor.getDocNum()) || StringUtils.isBlank(doctor.getDocPassword())) {
            return ResultUtils.errorMsg("用户名和密码不能为空");
        }

        try {
            Doctor res = doctorService.queryUserIsExist(doctor.getDocNum(), doctor.getDocPassword());
            if (res != null) {
                res.setDocPassword("");
                return ResultUtils.ok(setDocterRedisSessionToken(res));
            }
        } catch (BizException e) {
            return ResultUtils.errorMsg(e.getMessage());
        }

        return ResultUtils.errorException("通信错误");

    }

    @ApiOperation(value = "用户注销")
    @ApiImplicitParam(name = "userId", value = "用户Id", required = true,
            dataType = "String", paramType = "query")
    @GetMapping("/user/logout")
    public ResultUtils logout(String userId) throws NoSuchAlgorithmException {

        redis.del(USER_REDIS_SESSION + ":" + userId);

        return ResultUtils.ok("注销成功 ");

    }

    @ApiOperation(value = "用户注销")
    @ApiImplicitParam(name = "docId", value = "医生Id", required = true,
            dataType = "String", paramType = "query")
    @GetMapping("/doctor/logout")
    public ResultUtils docLogout(String docId) throws NoSuchAlgorithmException {

        redis.del(USER_REDIS_SESSION + ":" + docId);

        return ResultUtils.ok("注销成功 ");

    }

    public UserVO setUserRedisSessionToken(User userModel) {

        String uniqueToken = UUID.randomUUID().toString();
        redis.set(USER_REDIS_SESSION + ":" + userModel.getUserId(), uniqueToken, 1000*60*30);

        UserVO vo = new UserVO();
        BeanUtils.copyProperties(userModel, vo);

        vo.setUserToken(uniqueToken);

        return vo;
    }

    public DoctorVO setDocterRedisSessionToken(Doctor doctorModel) {

        String uniqueToken = UUID.randomUUID().toString();
        redis.set(USER_REDIS_SESSION + ":" + doctorModel.getDocId(), uniqueToken, 1000*60*30);

        DoctorVO vo = new DoctorVO();
        BeanUtils.copyProperties(doctorModel, vo);

        vo.setDoctorToken(uniqueToken);

        return vo;
    }

}
