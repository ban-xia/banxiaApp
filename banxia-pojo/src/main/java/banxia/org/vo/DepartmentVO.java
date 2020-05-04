package banxia.org.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 科室表
 * @author xiexin
 * @create 2020-04-07 2:15 下午
 */
@Table(name = "banxia_department")
public class DepartmentVO {

    /**
     * 自增id
     */
    @Id
    private Integer depId;

    /**
     * 科室编号
     */
    private String depNum;

    /**
     * 科室名称
     */
    private String depName;

    /**
     * 科室介绍
     */
    private String depIntro;

    /**
     * 科室其他信息
     */
    private String depExtra;

    /**
     * 是否被删除
     */
    private Integer deleted;

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

    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    public String getDepNum() {
        return depNum;
    }

    public void setDepNum(String depNum) {
        this.depNum = depNum;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getDepIntro() {
        return depIntro;
    }

    public void setDepIntro(String depIntro) {
        this.depIntro = depIntro;
    }

    public String getDepExtra() {
        return depExtra;
    }

    public void setDepExtra(String depExtra) {
        this.depExtra = depExtra;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
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
