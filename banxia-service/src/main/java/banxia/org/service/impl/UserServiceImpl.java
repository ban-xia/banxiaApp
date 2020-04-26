package banxia.org.service.impl;

import banxia.org.mapper.UserMapper;
import banxia.org.pojo.User;
import banxia.org.service.UserService;
import banxia.org.utils.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: 紫苏
 * @date: 2020/4/11 下午11:36
 * @description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public ResultUtils insert(User user) {
        userMapper.insert(user);
        return null;
    }
}
