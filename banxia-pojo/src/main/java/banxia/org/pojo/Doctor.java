package banxia.org.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 医生表
 * @author xiexin
 * @create 2020-04-07 5:03 下午
 */
@ApiModel(value = "医生")
@Table(name = "banxia_doctor")
public class Doctor {

    /**
     * 自增id
     */
    @ApiModelProperty(value = "医生id", name = "docId", example = "1", required = true)
    @Id
    private Integer docId;

    /**
     * 医生编号
     */
    @ApiModelProperty(value = "医生编号", name = "docNum", example = "sjnk_wuyanzu", required = true)
    private String docNum;

    /**
     * 医生编号
     */
    @ApiModelProperty(value = "医生密碼", name = "docPassword", example = "", required = true)
    private String docPassword;

    /**
     * 医生名称
     */
    @ApiModelProperty(value = "医生名称", name = "docName", example = "wuyanzu", required = true)
    private String docName;

    /**
     * 医生电话
     */
    @ApiModelProperty(value = "医生手机号", name = "docPhone", example = "15771803174", required = true)
    private String docPhone;

    /**
     * 医生年龄
     */
    @ApiModelProperty(value = "医生年龄", name = "docAge", example = "28", required = true)
    private Integer docAge;

    /**
     * 医生国家
     */
    @ApiModelProperty(value = "医生国籍", name = "docCountry", example = "中国", required = true)
    private String docCountry;

    /**
     * 医生民族
     */
    @ApiModelProperty(value = "医生民族", name = "docNation", example = "汉族", required = true)
    private String docNation;

    /**
     * 医生户籍
     */
    @ApiModelProperty(value = "医生户籍", name = "docAddress", example = "-")
    private String docAddress;

    /**
     * 医生从属科室
     */
    @ApiModelProperty(value = "医生从属科室", name = "docPedId", example = "6", required = true)
    private Integer docDepId;

    /**
     * 医生性别 0女；1男
     */
    @ApiModelProperty(value = "医生性别", name = "docGender", example = "0", required = true)
    private Integer docGender;

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

    public String getDocPassword() {
        return docPassword;
    }

    public void setDocPassword(String docPassword) {
        this.docPassword = docPassword;
    }
}
