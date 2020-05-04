package banxia.org.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 值班表
 * @author xiexin
 * @create 2020-04-07 5:01 下午
 */
@Table(name = "banxia_duty")
public class DutyVO {

    /**
     * 自增id
     */
    private Integer dutyId;

    /**
     * 值班当天日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dutyDate;

    /**
     * 值班科室
     */
    private Integer dutyDepartId;

    private Integer dutyPeriod;

    /**
     * 值班医生id
     */
    private Integer dutyDocId;

    /**
     * 值班状态 0当值1不当值
     */
    private Integer dutyOnDuty;

    private String docName;

    public Integer getDutyId() {
        return dutyId;
    }

    public void setDutyId(Integer dutyId) {
        this.dutyId = dutyId;
    }

    public Date getDutyDate() {
        return dutyDate;
    }

    public void setDutyDate(Date dutyDate) {
        this.dutyDate = dutyDate;
    }

    public Integer getDutyDepartId() {
        return dutyDepartId;
    }

    public void setDutyDepartId(Integer dutyDepartId) {
        this.dutyDepartId = dutyDepartId;
    }

    public Integer getDutyDocId() {
        return dutyDocId;
    }

    public void setDutyDocId(Integer dutyDocId) {
        this.dutyDocId = dutyDocId;
    }

    public Integer getDutyOnDuty() {
        return dutyOnDuty;
    }

    public void setDutyOnDuty(Integer dutyOnDuty) {
        this.dutyOnDuty = dutyOnDuty;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public Integer getDutyPeriod() {
        return dutyPeriod;
    }

    public void setDutyPeriod(Integer dutyPeriod) {
        this.dutyPeriod = dutyPeriod;
    }
}
