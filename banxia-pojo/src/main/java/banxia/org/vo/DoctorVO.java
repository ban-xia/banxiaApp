package banxia.org.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Id;
import java.util.Date;

/**
 * @author: 紫苏
 * @date: 2020/5/4 上午12:15
 * @description:
 */
public class DoctorVO {

    private Integer docId;

    private String docNum;

    private String docName;

    private String docPhone;

    private Integer docAge;

    private String docCountry;

    private String docNation;

    private String docAddress;

    private Integer docDepId;

    private Integer docGender;

    private String depName;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createdAt;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date updatedAt;

    private String createdBy;

    private String updatedBy;

    private String doctorToken;

    public Integer getDocId() {
        return docId;
    }

    public void setDocId(Integer docId) {
        this.docId = docId;
    }

    public String getDocNum() {
        return docNum;
    }

    public void setDocNum(String docNum) {
        this.docNum = docNum;
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

    public Integer getDocAge() {
        return docAge;
    }

    public void setDocAge(Integer docAge) {
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

    public Integer getDocDepId() {
        return docDepId;
    }

    public void setDocDepId(Integer docDepId) {
        this.docDepId = docDepId;
    }

    public Integer getDocGender() {
        return docGender;
    }

    public void setDocGender(Integer docGender) {
        this.docGender = docGender;
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

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getDoctorToken() {
        return doctorToken;
    }

    public void setDoctorToken(String doctorToken) {
        this.doctorToken = doctorToken;
    }
}
