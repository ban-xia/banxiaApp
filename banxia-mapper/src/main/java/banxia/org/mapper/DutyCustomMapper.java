package banxia.org.mapper;

import banxia.org.utils.MyMapper;
import banxia.org.vo.DutyVO;

import java.util.List;

/**
 * @author: 紫苏
 * @date: 2020/5/4 下午5:49
 * @description:
 */
public interface DutyCustomMapper extends MyMapper<DutyVO> {
    List<DutyVO> selectAllDuty(int depId, int noon, String starttime, String endtime);
}
