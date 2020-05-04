package banxia.org.service;

import banxia.org.pojo.Doctor;
import banxia.org.utils.PagedResult;

import java.util.List;

/**
 * @author: 紫苏
 * @date: 2020/4/11 下午11:35
 * @description:
 */
public interface DoctorService {

    PagedResult queryDoctorList(Integer depId, String name, Integer page, Integer pageSize, String date);

    Doctor queryDoctorById(int docId);

    boolean saveDoctor(Doctor doctor);

    boolean updateDoctor(Doctor doctor);

    boolean deleteDoctor(int docId);

}
