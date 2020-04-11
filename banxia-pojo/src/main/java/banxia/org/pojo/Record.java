package banxia.org.pojo;

import javax.persistence.Id;
import java.util.Date;

/**
 * 病历表
 * @author xiexin
 * @create 2020-04-07 4:59 下午
 */
public class Record {

    /**
     *自增id
     */
    @Id
    private int recId;

    /**
     * 病历科室id
     */
    private int recDepId;

    /**
     * 病历医生id
     */
    private int recDocId;

    /**
     * 病历患者id
     */
    private int recUserId;

    /**
     * 病历详情
     */
    private String recIntro;

    /**
     * 病历补充
     */
    private String recExtra;

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

    public int getRecId() {
        return recId;
    }

    public void setRecId(int recId) {
        this.recId = recId;
    }

    public int getRecDepId() {
        return recDepId;
    }

    public void setRecDepId(int recDepId) {
        this.recDepId = recDepId;
    }

    public int getRecDocId() {
        return recDocId;
    }

    public void setRecDocId(int recDocId) {
        this.recDocId = recDocId;
    }

    public int getRecUserId() {
        return recUserId;
    }

    public void setRecUserId(int recUserId) {
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
