package banxia.org.service.impl;

import banxia.org.mapper.DoctorCustomMapper;
import banxia.org.mapper.DoctorMapper;
import banxia.org.pojo.Department;
import banxia.org.pojo.Doctor;
import banxia.org.service.DoctorService;
import banxia.org.utils.MD5Utils;
import banxia.org.utils.PagedResult;
import banxia.org.vo.DoctorVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author: 紫苏
 * @date: 2020/4/11 下午11:35
 * @description:
 */
@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorMapper doctorMapper;

    @Autowired
    private DoctorCustomMapper doctorMapperCustom;

    @Override
    public PagedResult queryDoctorList(Integer depId, String name, Integer page, Integer pageSize, String datetime) {

        PageHelper.startPage(page, pageSize);
        List<DoctorVO> list = doctorMapperCustom.selectAllDoctors(depId, name, datetime);

        PageInfo<DoctorVO> pageList = new PageInfo<>(list);
        PagedResult pagedResult = new PagedResult();
        pagedResult.setPage(page);
        pagedResult.setTotal(pageList.getPages());
        pagedResult.setRows(list);
        pagedResult.setRecords(pageList.getTotal());

        return pagedResult;
    }

    @Override
    public Doctor queryDoctorById(int docId) {

        Example doctorInfo = new Example(Doctor.class);
        Example.Criteria criteria = doctorInfo.createCriteria();
        criteria.andEqualTo("docId", docId);

        return doctorMapper.selectOneByExample(doctorInfo);
    }



    @Override
    public boolean saveDoctor(Doctor doctor) {

        try {
            doctor.setDocPassword(MD5Utils.getMD5Str(doctor.getDocNum()));
        } catch (Exception e) {

        }

        return doctorMapper.insert(doctor) != 0;
    }

    @Override
    public boolean updateDoctor(Doctor doctor) {

        Example doctorInfo = new Example(Department.class);
        Example.Criteria criteria = doctorInfo.createCriteria();
        criteria.andEqualTo("docId", doctor.getDocId());

        return doctorMapper.updateByExampleSelective(doctor, doctorInfo) != 0;
    }

    @Override
    public boolean deleteDoctor(int docId) {

        Example example = new Example(Doctor.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("docId", docId);

        return doctorMapper.deleteByExample(example) != 0;
    }
}
