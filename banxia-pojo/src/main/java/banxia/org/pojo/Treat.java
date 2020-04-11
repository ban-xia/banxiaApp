package banxia.org.pojo;

import javax.persistence.Id;
import java.util.Date;

/**
 * 诊治表
 * @author xiexin
 * @create 2020-04-07 4:55 下午
 */
public class Treat {

    /**
     * 自增id
     */
    @Id
    private int treatId;

    /**
     * 诊治科室id
     */
    private int treatDepId;

    /**
     * 诊治医生id
     */
    private int treatDocId;

    /**
     * 诊治患者id
     */
    private int treatUserId;

    /**
     * 诊治价格
     */
    private double treatPrice;

    /**
     * 诊治状态
     */
    private int treatStatus;

    /**
     * 诊治补充
     */
    private String treatExtra;

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

    public int getTreatId() {
        return treatId;
    }

    public void setTreatId(int treatId) {
        this.treatId = treatId;
    }

    public int getTreatDepId() {
        return treatDepId;
    }

    public void setTreatDepId(int treatDepId) {
        this.treatDepId = treatDepId;
    }

    public int getTreatDocId() {
        return treatDocId;
    }

    public void setTreatDocId(int treatDocId) {
        this.treatDocId = treatDocId;
    }

    public int getTreatUserId() {
        return treatUserId;
    }

    public void setTreatUserId(int treatUserId) {
        this.treatUserId = treatUserId;
    }

    public double getTreatPrice() {
        return treatPrice;
    }

    public void setTreatPrice(double treatPrice) {
        this.treatPrice = treatPrice;
    }

    public int getTreatStatus() {
        return treatStatus;
    }

    public void setTreatStatus(int treatStatus) {
        this.treatStatus = treatStatus;
    }

    public String getTreatExtra() {
        return treatExtra;
    }

    public void setTreatExtra(String treatExtra) {
        this.treatExtra = treatExtra;
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
