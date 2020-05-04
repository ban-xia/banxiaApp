package banxia.org.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 诊治表
 * @author xiexin
 * @create 2020-04-07 4:55 下午
 */
@Table(name = "banxia_treat")
public class TreatVO {

    /**
     * 自增id
     */
    @Id
    private Integer treatId;

    /**
     * 诊治科室id
     */
    private Integer treatDepId;

    /**
     * 诊治医生id
     */
    private Integer treatDocId;

    /**
     * 诊治患者id
     */
    private Integer treatUserId;

    /**
     * 诊治价格
     */
    private Double treatPrice;

    /**
     * 诊治状态
     */
    private Integer treatStatus;

    /**
     * 诊治补充
     */
    private String treatExtra;


    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createdAt;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date updatedAt;

    private String createdBy;

    private String updatedBy;


    public Integer getTreatId() {
        return treatId;
    }

    public void setTreatId(Integer treatId) {
        this.treatId = treatId;
    }

    public Integer getTreatDepId() {
        return treatDepId;
    }

    public void setTreatDepId(Integer treatDepId) {
        this.treatDepId = treatDepId;
    }

    public Integer getTreatDocId() {
        return treatDocId;
    }

    public void setTreatDocId(Integer treatDocId) {
        this.treatDocId = treatDocId;
    }

    public Integer getTreatUserId() {
        return treatUserId;
    }

    public void setTreatUserId(Integer treatUserId) {
        this.treatUserId = treatUserId;
    }

    public Double getTreatPrice() {
        return treatPrice;
    }

    public void setTreatPrice(Double treatPrice) {
        this.treatPrice = treatPrice;
    }

    public Integer getTreatStatus() {
        return treatStatus;
    }

    public void setTreatStatus(Integer treatStatus) {
        this.treatStatus = treatStatus;
    }

    public String getTreatExtra() {
        return treatExtra;
    }

    public void setTreatExtra(String treatExtra) {
        this.treatExtra = treatExtra;
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
