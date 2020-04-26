package banxia.org.service.impl;

import banxia.org.mapper.TreatMapper;
import banxia.org.service.TreatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: 紫苏
 * @date: 2020/4/11 下午11:36
 * @description:
 */
@Service
public class TreatServiceImpl implements TreatService {

    @Autowired
    private TreatMapper treatMapper;
}
