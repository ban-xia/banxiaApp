package banxia.org.service.impl;

import banxia.org.mapper.DepartmentMapper;
import banxia.org.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: 紫苏
 * @date: 2020/4/11 下午11:34
 * @description:
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;
}
