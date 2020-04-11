package banxia.org.pojo;

import javax.persistence.Id;
import java.util.Date;

/**
 * 科室表
 * @author xiexin
 * @create 2020-04-07 2:15 下午
 */
public class Department {

    /**
     * 自增id
     */
    @Id
    private int depId;

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

    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
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
