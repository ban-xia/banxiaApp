package banxia.org.pojo;

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
@ApiModel(value = "用户")
@Table(name = "banxia_user")
public class User {

    /**
     * 自增id
     */
    @ApiModelProperty(value = "用户id", name = "userId", example = "1", required = true)
    @Id
    private Integer userId;

    /**
     * 用户名称
     */
    @ApiModelProperty(value = "用户名称", name = "userName", example = "1", required = true)
    private String userName;

    /**
     * 用户密码
     */
    @ApiModelProperty(hidden = true)
    private String userPass;

    /**
     * 用户电话
     */
    @ApiModelProperty(value = "用户电话", name = "userPhone", example = "1", required = true)
    private String userPhone;

    /**
     * 用户头像地址
     */
    @ApiModelProperty(value = "用户头像地址", name = "userImage", example = "1", required = true)
    private String userImage;

    /**
     * 用户性别 0女1男
     */
    @ApiModelProperty(value = "用户性别 0女1男", name = "userGender", example = "1", required = true)
    private Integer userGender;

    /**
     * 用户年纪
     */
    @ApiModelProperty(value = "用户年纪", name = "userAge", example = "1", required = true)
    private Integer userAge;

    /**
     * 用户出生日期
     */
    @ApiModelProperty(value = "用户出生日期", name = "userBirth", example = "1", required = true)
    private String userBirth;

    /**
     * 用户身高
     */
    @ApiModelProperty(value = "用户身高", name = "userHeight", example = "1")
    private Integer userHeight;

    /**
     * 用户体重
     */
    @ApiModelProperty(value = "用户体重", name = "userWeight", example = "1")
    private Integer userWeight;

    /**
     * 用户吸烟史 0无1有
     */
    @ApiModelProperty(value = "用户吸烟史 0无1有", name = "userSmokeHist", example = "1")
    private Integer userSmokeHist;

    /**
     * 用户饮酒史 0无1有
     */
    @ApiModelProperty(value = "用户饮酒史 0无1有", name = "userDrinkHist", example = "1")
    private Integer userDrinkHist;

    /**
     * 用户是否结婚 0无1有
     */
    @ApiModelProperty(value = "用户是否结婚 0无1有", name = "userIsMarried", example = "1")
    private Integer userIsMarried;

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
}
