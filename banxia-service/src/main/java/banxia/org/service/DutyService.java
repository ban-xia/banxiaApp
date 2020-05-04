package banxia.org.service;

import banxia.org.pojo.Duty;
import banxia.org.vo.DutyVO;

import java.util.List;

/**
 * @author: 紫苏
 * @date: 2020/4/11 下午11:35
 * @description:
 */
public interface DutyService {

    List<DutyVO> queryDutyList(int depId, int noon);

    Duty queryDutyById(int dutyId);

    boolean saveDuty(
            int depId,
            int docId,
            String datetime,
            int noon
    );

    boolean updateDuty(
            int depId,
            String datetime,
            int noon);

    boolean deleteDuty(int dutyId);

}
