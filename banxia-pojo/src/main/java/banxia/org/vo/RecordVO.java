package banxia.org.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 病历表
 * @author xiexin
 * @create 2020-04-07 4:59 下午
 */
@ApiModel(value = "病历")
@Table(name = "banxia_record")
public class RecordVO {

    /**
     *自增id
     */
    @ApiModelProperty(value = "病历id", name = "recId", example = "1", required = true)
    @Id
    private Integer recId;

    /**
     * 病历科室id
     */
    @ApiModelProperty(value = "病历科室id", name = "recDepId", example = "1", required = true)
    private Integer recDepId;

    /**
     * 病历医生id
     */
    @ApiModelProperty(value = "病历医生id", name = "recDocId", example = "1", required = true)
    private Integer recDocId;

    /**
     * 病历患者id
     */
    @ApiModelProperty(value = "病历患者id", name = "recUserId", example = "1", required = true)
    private Integer recUserId;

    /**
     * 病历详情
     */
    @ApiModelProperty(value = "病历详情", name = "recIntro", example = "-", required = true)
    private String recIntro;

    /**
     * 病历补充
     */
    @ApiModelProperty(value = "病历补充", name = "recExtra", example = "-")
    private String recExtra;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @ApiModelProperty(hidden = true)
    private Date createdAt;

    /**
     * 修改时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @ApiModelProperty(hidden = true)
    private Date updatedAt;

    /**
     * 创建者
     */
    @ApiModelProperty(hidden = true)
    private String createdBy;

    /**
     * 修改者
     */
    @ApiModelProperty(hidden = true)
    private String updatedBy;

    public Integer getRecId() {
        return recId;
    }

    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    public Integer getRecDepId() {
        return recDepId;
    }

    public void setRecDepId(Integer recDepId) {
        this.recDepId = recDepId;
    }

    public Integer getRecDocId() {
        return recDocId;
    }

    public void setRecDocId(Integer recDocId) {
        this.recDocId = recDocId;
    }

    public Integer getRecUserId() {
        return recUserId;
    }

    public void setRecUserId(Integer recUserId) {
        this.recUserId = recUserId;
    }

    public String getRecIntro() {
        return recIntro;
    }

    public void setRecIntro(String recIntro) {
        this.recIntro = recIntro;
    }

    public String getRecExtra() {
        return recExtra;
    }

    public void setRecExtra(String recExtra) {
        this.recExtra = recExtra;
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
