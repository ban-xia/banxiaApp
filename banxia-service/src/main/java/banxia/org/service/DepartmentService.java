package banxia.org.service;

import banxia.org.pojo.Department;
import banxia.org.vo.DepartmentVO;
import io.swagger.annotations.ApiModel;

import java.util.List;

/**
 * @author: 紫苏
 * @date: 2020/4/11 下午11:34
 * @description:
 */
public interface DepartmentService {

    List<DepartmentVO> queryDepartmentList();

    Department queryDepartmentById(int depId);

    boolean saveDepartment(Department department);

    boolean updateDepartment(Department department);

    boolean queryDepartServiceIsExist(String depNum, String depName);
}
