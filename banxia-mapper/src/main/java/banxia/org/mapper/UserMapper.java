package banxia.org.mapper;

import banxia.org.pojo.User;
import banxia.org.utils.MyMapper;

/**
 * @author xiexin
 * @create 2020-04-07 5:32 下午
 */
public interface UserMapper extends MyMapper<User> {
    @Override
    int insert(User record);
}
