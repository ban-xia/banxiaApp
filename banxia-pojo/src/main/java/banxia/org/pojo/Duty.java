package banxia.org.pojo;

import javax.persistence.Id;
import java.util.Date;

/**
 * 值班表
 * @author xiexin
 * @create 2020-04-07 5:01 下午
 */
public class Duty {

    /**
     * 自增id
     */
    @Id
    private int dutyId;

    /**
     * 值班当天日期
     */
    private Date dutyDate;

    /**
     * 值班科室
     */
    private int dutyDepartId;

    /**
     * 值班时段 0上午1下午
     */
    private int dutyPeriod;

    /**
     * 值班医生id
     */
    private int dutyDocId;

    /**
     * 值班状态 0当值1不当值
     */
    private int dutyOnDuty;

    /**
     * 是否被删除
     */
    private int deleted;

    /**
     * 创建时间
     */
    private Date createdAt;

    /**
     * 修改时间
     */
    private Date updatedAt;

    /**
     * 创建者
     */
    private String createdBy;

    /**
     * 修改者
     */
    private String updatedBy;

    public int getDutyId() {
        return dutyId;
    }

    public void setDutyId(int dutyId) {
        this.dutyId = dutyId;
    }

    public Date getDutyDate() {
        return dutyDate;
    }

    public void setDutyDate(Date dutyDate) {
        this.dutyDate = dutyDate;
    }

    public int getDutyDepartId() {
        return dutyDepartId;
    }

    public void setDutyDepartId(int dutyDepartId) {
        this.dutyDepartId = dutyDepartId;
    }

    public int getDutyPeriod() {
        return dutyPeriod;
    }

    public void setDutyPeriod(int dutyPeriod) {
        this.dutyPeriod = dutyPeriod;
    }

    public int getDutyDocId() {
        return dutyDocId;
    }

    public void setDutyDocId(int dutyDocId) {
        this.dutyDocId = dutyDocId;
    }

    public int getDutyOnDuty() {
        return dutyOnDuty;
    }

    public void setDutyOnDuty(int dutyOnDuty) {
        this.dutyOnDuty = dutyOnDuty;
    }

    public int getDeleted() {
        return deleted;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
}
