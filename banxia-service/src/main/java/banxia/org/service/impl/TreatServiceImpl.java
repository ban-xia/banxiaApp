package banxia.org.service.impl;

import banxia.org.mapper.TreatCustomMapper;
import banxia.org.mapper.TreatMapper;
import banxia.org.pojo.Department;
import banxia.org.pojo.Record;
import banxia.org.pojo.Treat;
import banxia.org.service.TreatService;
import banxia.org.vo.TreatVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author: 紫苏
 * @date: 2020/4/11 下午11:36
 * @description:
 */
@Service
public class TreatServiceImpl implements TreatService {

    @Autowired
    private TreatMapper treatMapper;

    @Autowired
    private TreatCustomMapper treatCustomMapper;

    @Override
    public List<TreatVO> queryTreatList(String treatStatus) {

        Example treatInfo = new Example(TreatVO.class);
        Example.Criteria criteria = treatInfo.createCriteria();

        if (treatStatus != null && treatStatus != null) {
            criteria.andEqualTo("treatStatus", Integer.parseInt(treatStatus));
        }

        return treatCustomMapper.selectByExample(treatInfo);
    }

    @Override
    public TreatVO queryTreatById(int treatId) {
        Example recordInfo = new Example(TreatVO.class);
        Example.Criteria criteria = recordInfo.createCriteria();
        criteria.andEqualTo("treatId", treatId);

        return treatCustomMapper.selectOneByExample(recordInfo);
    }

    @Override
    public boolean saveTreat(Treat treat) {
        return treatMapper.insert(treat) != 0;
    }

    @Override
    public boolean updateTreat(String treatId, String status) {

        Treat treat = new Treat();
        treat.setTreatStatus(Integer.parseInt(status));

        Example treatInfo = new Example(Treat.class);
        Example.Criteria criteria = treatInfo.createCriteria();
        criteria.andEqualTo("treatId", Integer.parseInt(treatId));

        return treatMapper.updateByExampleSelective(treat, treatInfo) != 0;
    }

    @Override
    public boolean deleteTreat(int treatId) {
        Example example = new Example(Treat.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("treatId", treatId);

        return treatMapper.deleteByExample(example) != 0;
    }
}
