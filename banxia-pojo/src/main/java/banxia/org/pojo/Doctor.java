package banxia.org.pojo;

import javax.persistence.Id;
import java.util.Date;

/**
 * 医生表
 * @author xiexin
 * @create 2020-04-07 5:03 下午
 */
public class Doctor {

    /**
     * 自增id
     */
    @Id
    private int docId;

    /**
     * 医生编号
     */
    private String docNum;

    /**
     * 医生pass
     */
    private String docPassword;

    /**
     * 医生名称
     */
    private String docName;

    /**
     * 医生电话
     */
    private String docPhone;

    /**
     * 医生年龄
     */
    private int docAge;

    /**
     * 医生国家
     */
    private String docCountry;

    /**
     * 医生民族
     */
    private String docNation;

    /**
     * 医生户籍
     */
    private String docAddress;

    /**
     * 医生从属科室
     */
    private int docPedId;

    /**
     * 医生性别 0女；1男
     */
    private int docGender;

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

    public int getDocId() {
        return docId;
    }

    public void setDocId(int docId) {
        this.docId = docId;
    }

    public String getDocNum() {
        return docNum;
    }

    public void setDocNum(String docNum) {
        this.docNum = docNum;
    }

    public String getDocPassword() {
        return docPassword;
    }

    public void setDocPassword(String docPassword) {
        this.docPassword = docPassword;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getDocPhone() {
        return docPhone;
    }

    public void setDocPhone(String docPhone) {
        this.docPhone = docPhone;
    }

    public int getDocAge() {
        return docAge;
    }

    public void setDocAge(int docAge) {
        this.docAge = docAge;
    }

    public String getDocCountry() {
        return docCountry;
    }

    public void setDocCountry(String docCountry) {
        this.docCountry = docCountry;
    }

    public String getDocNation() {
        return docNation;
    }

    public void setDocNation(String docNation) {
        this.docNation = docNation;
    }

    public String getDocAddress() {
        return docAddress;
    }

    public void setDocAddress(String docAddress) {
        this.docAddress = docAddress;
    }

    public int getDocPedId() {
        return docPedId;
    }

    public void setDocPedId(int docPedId) {
        this.docPedId = docPedId;
    }

    public int getDocGender() {
        return docGender;
    }

    public void setDocGender(int docGender) {
        this.docGender = docGender;
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
