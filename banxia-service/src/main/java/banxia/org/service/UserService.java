package banxia.org.service;

import banxia.org.pojo.Treat;
import banxia.org.pojo.User;
import banxia.org.utils.ResultUtils;

import java.util.List;

/**
 * @author: 紫苏
 * @date: 2020/4/11 下午11:36
 * @description:
 */
public interface UserService {

    List<User> queryTreatList();

    User queryUserById(int userId);

    boolean saveUser(User user);

    boolean updateUser(User user);

    boolean deleteUser(int userId);

    boolean queryPhoneIsExist(String phone);
}
