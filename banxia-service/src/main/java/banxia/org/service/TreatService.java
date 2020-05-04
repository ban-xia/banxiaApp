package banxia.org.service;

import banxia.org.pojo.Treat;
import banxia.org.vo.TreatVO;

import java.util.List;

/**
 * @author: 紫苏
 * @date: 2020/4/11 下午11:36
 * @description:
 */
public interface TreatService {

    List<TreatVO> queryTreatList(String treatStatus);

    TreatVO queryTreatById(int treatId);

    boolean saveTreat(Treat treat);

    boolean updateTreat(String treatId, String status);

    boolean deleteTreat(int treatId);

}
