package banxia.org.service.impl;

import banxia.org.mapper.DutyMapper;
import banxia.org.service.DutyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: 紫苏
 * @date: 2020/4/11 下午11:35
 * @description:
 */
@Service
public class DutyServiceImpl implements DutyService {

    @Autowired
    private DutyMapper dutyMapper;
}
