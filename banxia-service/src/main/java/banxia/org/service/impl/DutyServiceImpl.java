package banxia.org.service.impl;

import banxia.org.mapper.DutyCustomMapper;
import banxia.org.mapper.DutyMapper;
import banxia.org.pojo.Department;
import banxia.org.pojo.Doctor;
import banxia.org.pojo.Duty;
import banxia.org.service.DutyService;
import banxia.org.utils.TimeUtils;
import banxia.org.vo.DutyVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author: 紫苏
 * @date: 2020/4/11 下午11:35
 * @description:
 */
@Service
public class DutyServiceImpl implements DutyService {

    @Autowired
    private DutyMapper dutyMapper;

    @Autowired
    private DutyCustomMapper dutyCustomMapper;

    @Override
    public List<DutyVO> queryDutyList(int depId, int noon) {

        String starttime = TimeUtils.timestampToStr(TimeUtils.getDailyStartTime(System.currentTimeMillis(), "GMT+8:00"));
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) + 6);

        String endtime = TimeUtils.timestampToStr(calendar.getTimeInMillis());

        return dutyCustomMapper.selectAllDuty(depId, noon, starttime, endtime);
    }

    @Override
    public Duty queryDutyById(int dutyId) {
        Example dutyInfo = new Example(Duty.class);
        Example.Criteria criteria = dutyInfo.createCriteria();
        criteria.andEqualTo("dutyId", dutyId);

        return dutyMapper.selectOneByExample(dutyInfo);
    }

    @Override
    public boolean saveDuty(
            int depId,
            int docId,
            String datetime,
            int noon
    ) {

        return dutyMapper.insertDuty(depId, docId, datetime, noon) != 0;
    }

    @Override
    public boolean updateDuty(
            int depId,
            String datetime,
            int noon
    ) {

        Duty duty = new Duty();
        duty.setDutyOnDuty(1);

        Example example = new Example(Duty.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("dutyDepartId", depId).andEqualTo("dutyDate", datetime).andEqualTo("dutyPeriod", noon);

        return dutyMapper.updateByExampleSelective(duty, example) != 0;
    }

    @Override
    public boolean deleteDuty(int dutyId) {
        Example example = new Example(Doctor.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("dutyId", dutyId);

        return dutyMapper.deleteByExample(example) != 0;
    }
}
