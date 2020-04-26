package banxia.org.controller;

import banxia.org.pojo.User;
import banxia.org.service.UserService;
import banxia.org.utils.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiexin
 * @create 2020-04-20 5:28 下午
 * @description
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    public ResultUtils addUser(User user){
        userService.insert(user);
        return ResultUtils.ok("用户注册成功！");
    }
}
