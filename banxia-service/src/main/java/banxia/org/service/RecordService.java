package banxia.org.service;

import banxia.org.pojo.Doctor;
import banxia.org.pojo.Record;
import banxia.org.vo.RecordVO;

import java.util.List;

/**
 * @author: 紫苏
 * @date: 2020/4/11 下午11:42
 * @description:
 */
public interface RecordService {

    List<RecordVO> queryDoctorList(String userId);

    RecordVO queryRecordById(int recId);

    boolean saveRecord(Record record);

    boolean updateRecord(Record record);

    boolean deleteRecord(int recId);

}
