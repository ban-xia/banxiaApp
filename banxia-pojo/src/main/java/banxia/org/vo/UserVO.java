package banxia.org.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 患者表
 * @author xiexin
 * @create 2020-04-07 4:45 下午
 */
@Table(name = "banxia_user")
public class UserVO {

    /**
     * 自增id
     */
    @Id
    private Integer userId;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 用户密码
     */
    private String userPass;

    /**
     * 用户电话
     */
    private String userPhone;

    /**
     * 用户头像地址
     */
    private String userImage;

    /**
     * 用户性别 0女1男
     */
    private Integer userGender;

    /**
     * 用户年纪
     */
    private Integer userAge;

    /**
     * 用户出生日期
     */
    private String userBirth;

    /**
     * 用户身高
     */
    private Integer userHeight;

    /**
     * 用户体重
     */
    private Integer userWeight;

    /**
     * 用户吸烟史 0无1有
     */
    private Integer userSmokeHist;

    /**
     * 用户饮酒史 0无1有
     */
    private Integer userDrinkHist;

    /**
     * 用户是否结婚 0无1有
     */
    private Integer userIsMarried;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createdAt;

    /**
     * 修改时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date updatedAt;

    /**
     * 创建者
     */
    private String createdBy;

    /**
     * 修改者
     */
    private String updatedBy;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public Integer getUserGender() {
        return userGender;
    }

    public void setUserGender(Integer userGender) {
        this.userGender = userGender;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getUserBirth() {
        return userBirth;
    }

    public void setUserBirth(String userBirth) {
        this.userBirth = userBirth;
    }

    public Integer getUserHeight() {
        return userHeight;
    }

    public void setUserHeight(Integer userHeight) {
        this.userHeight = userHeight;
    }

    public Integer getUserWeight() {
        return userWeight;
    }

    public void setUserWeight(Integer userWeight) {
        this.userWeight = userWeight;
    }

    public Integer getUserSmokeHist() {
        return userSmokeHist;
    }

    public void setUserSmokeHist(Integer userSmokeHist) {
        this.userSmokeHist = userSmokeHist;
    }

    public Integer getUserDrinkHist() {
        return userDrinkHist;
    }

    public void setUserDrinkHist(Integer userDrinkHist) {
        this.userDrinkHist = userDrinkHist;
    }

    public Integer getUserIsMarried() {
        return userIsMarried;
    }

    public void setUserIsMarried(Integer userIsMarried) {
        this.userIsMarried = userIsMarried;
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
