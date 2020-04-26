package banxia.org.service.impl;

import banxia.org.mapper.DoctorMapper;
import banxia.org.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: 紫苏
 * @date: 2020/4/11 下午11:35
 * @description:
 */
@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorMapper doctorMapper;
}
