package banxia.org.pojo;

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
@ApiModel(value = "部门")
@Table(name = "banxia_department")
public class Department {

    /**
     * 自增id
     */
    @ApiModelProperty(value = "部门id", name = "depId", example = "1", required = true)
    @Id
    private Integer depId;

    /**
     * 科室编号
     */
    @ApiModelProperty(value = "部门编号", name = "depNum", example = "banxia_sjnk", required = true)
    private String depNum;

    /**
     * 科室名称
     */
    @ApiModelProperty(value = "部门名称", name = "depName", example = "神经内科", required = true)
    private String depName;

    /**
     * 科室介绍
     */
    @ApiModelProperty(value = "部门简介", name = "depIntro", example = "-")
    private String depIntro;

    /**
     * 科室其他信息
     */
    @ApiModelProperty(value = "部门其他信息", name = "depExtra", example = "-")
    private String depExtra;

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

}
