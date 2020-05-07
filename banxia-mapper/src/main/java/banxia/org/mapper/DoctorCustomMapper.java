package banxia.org.mapper;

import banxia.org.pojo.Doctor;
import banxia.org.pojo.Duty;
import banxia.org.utils.MyMapper;
import banxia.org.vo.DoctorVO;
import banxia.org.vo.DutyVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: 紫苏
 * @date: 2020/5/4 上午12:19
 * @description:
 */
public interface DoctorCustomMapper extends MyMapper<DoctorVO> {
    List<DoctorVO> selectAllDoctors(Integer depId, String name, String datetime);



    List<DoctorVO> selectAllDoctorsWithId(@Param("list") List<Integer> list);
}
