package banxia.org.pojo;

import javax.persistence.Id;
import java.util.Date;

/**
 * 患者表
 * @author xiexin
 * @create 2020-04-07 4:45 下午
 */
public class User {

    /**
     * 自增id
     */
    @Id
    private int userId;

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
    private int userGender;

    /**
     * 用户年纪
     */
    private int userAge;

    /**
     * 用户出生日期
     */
    private String userBirth;

    /**
     * 用户身高
     */
    private int userHeight;

    /**
     * 用户体重
     */
    private int userWeight;

    /**
     * 用户吸烟史 0无1有
     */
    private int userSmokeHist;

    /**
     * 用户饮酒史 0无1有
     */
    private int userDrinkHist;

    /**
     * 用户是否结婚 0无1有
     */
    private int userIsMarried;

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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
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

    public int getUserGender() {
        return userGender;
    }

    public void setUserGender(int userGender) {
        this.userGender = userGender;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getUserBirth() {
        return userBirth;
    }

    public void setUserBirth(String userBirth) {
        this.userBirth = userBirth;
    }

    public int getUserHeight() {
        return userHeight;
    }

    public void setUserHeight(int userHeight) {
        this.userHeight = userHeight;
    }

    public int getUserWeight() {
        return userWeight;
    }

    public void setUserWeight(int userWeight) {
        this.userWeight = userWeight;
    }

    public int getUserSmokeHist() {
        return userSmokeHist;
    }

    public void setUserSmokeHist(int userSmokeHist) {
        this.userSmokeHist = userSmokeHist;
    }

    public int getUserDrinkHist() {
        return userDrinkHist;
    }

    public void setUserDrinkHist(int userDrinkHist) {
        this.userDrinkHist = userDrinkHist;
    }

    public int getUserIsMarried() {
        return userIsMarried;
    }

    public void setUserIsMarried(int userIsMarried) {
        this.userIsMarried = userIsMarried;
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
