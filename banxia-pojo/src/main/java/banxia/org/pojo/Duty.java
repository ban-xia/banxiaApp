package banxia.org.pojo;

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
@ApiModel(value = "值班")
@Table(name = "banxia_duty")
public class Duty {

    /**
     * 自增id
     */
    @ApiModelProperty(value = "值班id", name = "dutyId", example = "1", required = true)
    @Id
    private Integer dutyId;

    /**
     * 值班当天日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "值班当天日期", name = "dutyDate", example = "2019-02-15", required = true)
    private Date dutyDate;

    /**
     * 值班科室
     */
    @ApiModelProperty(value = "值班科室", name = "dutyDepartId", example = "2", required = true)
    private Integer dutyDepartId;

    /**
     * 值班时段 0上午1下午
     */
    @ApiModelProperty(value = "值班时段 0上午1下午", name = "dutyPeriod", example = "0", required = true)
    private Integer dutyPeriod;

    /**
     * 值班医生id
     */
    @ApiModelProperty(value = "值班医生id", name = "dutyDocId", example = "4", required = true)
    private Integer dutyDocId;

    /**
     * 值班状态 0当值1不当值
     */
    @ApiModelProperty(value = "值班状态 0当值1不当值", name = "dutyOnDuty", example = "0", required = true)
    private Integer dutyOnDuty;


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

    public Integer getDutyPeriod() {
        return dutyPeriod;
    }

    public void setDutyPeriod(Integer dutyPeriod) {
        this.dutyPeriod = dutyPeriod;
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
}
