package banxia.org.service.impl;

import banxia.org.mapper.RecordCustomMapper;
import banxia.org.mapper.RecordMapper;
import banxia.org.pojo.Department;
import banxia.org.pojo.Doctor;
import banxia.org.pojo.Duty;
import banxia.org.pojo.Record;
import banxia.org.service.RecordService;
import banxia.org.vo.RecordVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author: 紫苏
 * @date: 2020/4/11 下午11:42
 * @description:
 */
@Service
public class RecordServiceImpl implements RecordService {

    @Autowired
    private RecordMapper recordMapper;

    @Autowired
    private RecordCustomMapper recordCustomMapper;

    @Override
    public List<RecordVO> queryDoctorList(String userId) {

        Example recordInfo = new Example(Record.class);
        Example.Criteria criteria = recordInfo.createCriteria();
        criteria.andEqualTo("recUserId", userId);

        return recordCustomMapper.selectByExample(recordInfo);
    }

    @Override
    public RecordVO queryRecordById(int recordId) {
        Example recordInfo = new Example(RecordVO.class);
        Example.Criteria criteria = recordInfo.createCriteria();
        criteria.andEqualTo("recordId", recordId);

        return recordCustomMapper.selectOneByExample(recordInfo);
    }

    @Override
    public boolean saveRecord(Record record) {
        return recordMapper.insert(record) != 0;
    }

    @Override
    public boolean updateRecord(Record record) {
        Example recordInfo = new Example(Record.class);
        Example.Criteria criteria = recordInfo.createCriteria();
        criteria.andEqualTo("recordId", record.getRecId());

        return recordMapper.updateByExampleSelective(record, recordInfo) != 0;
    }

    @Override
    public boolean deleteRecord(int recId) {
        Example example = new Example(Record.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("recordId", recId);

        return recordMapper.deleteByExample(example) != 0;
    }
}
