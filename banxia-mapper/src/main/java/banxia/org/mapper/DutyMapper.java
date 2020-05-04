package banxia.org.mapper;

import banxia.org.pojo.Duty;
import banxia.org.utils.MyMapper;

/**
 * @author xiexin
 * @create 2020-04-07 5:53 下午
 */
public interface DutyMapper extends MyMapper<Duty> {
    int insertDuty(int depId, int docId, String datetime, int noon);
}
