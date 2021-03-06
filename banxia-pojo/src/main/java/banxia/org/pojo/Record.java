package banxia.org.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 病历表
 * @author xiexin
 * @create 2020-04-07 4:59 下午
 */
@ApiModel(value = "病历")
@Table(name = "banxia_record")
public class Record {

    /**
     *自增id
     */
    @ApiModelProperty(value = "病历id", name = "recId", example = "1", required = true)
    @Id
    private Integer recId;

    /**
     * 病历科室id
     */
    @ApiModelProperty(value = "病历科室id", name = "recDepId", example = "1", required = true)
    private Integer recDepId;

    /**
     * 病历医生id
     */
    @ApiModelProperty(value = "病历医生id", name = "recDocId", example = "1", required = true)
    private Integer recDocId;

    /**
     * 病历患者id
     */
    @ApiModelProperty(value = "病历患者id", name = "recUserId", example = "1", required = true)
    private Integer recUserId;

    /**
     * 病历详情
     */
    @ApiModelProperty(value = "病历详情", name = "recIntro", example = "-", required = true)
    private String recIntro;

    /**
     * 病历补充
     */
    @ApiModelProperty(value = "病历补充", name = "recExtra", example = "-")
    private String recExtra;

    public Integer getRecId() {
        return recId;
    }

    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    public Integer getRecDepId() {
        return recDepId;
    }

    public void setRecDepId(Integer recDepId) {
        this.recDepId = recDepId;
    }

    public Integer getRecDocId() {
        return recDocId;
    }

    public void setRecDocId(Integer recDocId) {
        this.recDocId = recDocId;
    }

    public Integer getRecUserId() {
        return recUserId;
    }

    public void setRecUserId(Integer recUserId) {
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

}
