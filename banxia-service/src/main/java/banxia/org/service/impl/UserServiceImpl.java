package banxia.org.service.impl;

import banxia.org.mapper.UserMapper;
import banxia.org.pojo.Department;
import banxia.org.pojo.Record;
import banxia.org.pojo.Treat;
import banxia.org.pojo.User;
import banxia.org.service.UserService;
import banxia.org.utils.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

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
    public List<User> queryTreatList() {
        return userMapper.selectAll();
    }

    @Override
    public User queryUserById(int userId) {
        Example userInfo = new Example(User.class);
        Example.Criteria criteria = userInfo.createCriteria();
        criteria.andEqualTo("userId", userId);

        return userMapper.selectOneByExample(userInfo);
    }

    @Override
    public boolean saveUser(User user) {
        return userMapper.insert(user) != 0;
    }

    @Override
    public boolean updateUser(User user) {
        Example userInfo = new Example(User.class);
        Example.Criteria criteria = userInfo.createCriteria();
        criteria.andEqualTo("userId", user.getUserId());

        return userMapper.updateByExampleSelective(user, userInfo) != 0;
    }

    @Override
    public boolean deleteUser(int userId) {
        Example example = new Example(User.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("userId", userId);

        return userMapper.deleteByExample(example) != 0;
    }

    @Override
    public boolean queryPhoneIsExist(String phone) {
        User user = new User();
        user.setUserPhone(phone);

        User res = userMapper.selectOne(user);

        return res != null;
    }
}
