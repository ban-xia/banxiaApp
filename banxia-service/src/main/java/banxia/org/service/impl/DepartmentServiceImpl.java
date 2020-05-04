package banxia.org.service.impl;

import banxia.org.mapper.DepartmentCustomMapper;
import banxia.org.mapper.DepartmentMapper;
import banxia.org.pojo.Department;
import banxia.org.service.DepartmentService;
import banxia.org.vo.DepartmentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author: 紫苏
 * @date: 2020/4/11 下午11:34
 * @description:
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Autowired
    private DepartmentCustomMapper departmentCustomMapper;

    @Override
    public List<DepartmentVO> queryDepartmentList() {
        return departmentCustomMapper.selectAll();
    }

    @Override
    public Department queryDepartmentById(int depId) {

        Example departmentInfo = new Example(Department.class);
        Example.Criteria criteria = departmentInfo.createCriteria();
        criteria.andEqualTo("depId", depId);
        Department department = departmentMapper.selectOneByExample(departmentInfo);

        return department;
    }

    @Override
    public boolean saveDepartment(Department department) {
        return departmentMapper.insert(department) != 0;
    }

    @Override
    public boolean updateDepartment(Department department) {

        Example departmentInfo = new Example(Department.class);
        Example.Criteria criteria = departmentInfo.createCriteria();
        criteria.andEqualTo("depId", department.getDepId());

        return departmentMapper.updateByExampleSelective(department, departmentInfo) != 0;
    }

    @Override
    public boolean queryDepartServiceIsExist(String depNum, String depName) {

        Department departmentWithDepNum = new Department();
        departmentWithDepNum.setDepNum(depNum);
        Department departmentWithDepName = new Department();
        departmentWithDepName.setDepName(depName);

        return departmentMapper.selectOne(departmentWithDepNum) != null && departmentMapper.selectOne(departmentWithDepName) != null;
    }
}
