package banxia.org.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 诊治表
 * @author xiexin
 * @create 2020-04-07 4:55 下午
 */
@ApiModel(value = "诊治")
@Table(name = "banxia_treat")
public class Treat {

    /**
     * 自增id
     */
    @ApiModelProperty(value = "诊治id", name = "treatId", example = "1", required = true)
    @Id
    private Integer treatId;

    /**
     * 诊治科室id
     */
    @ApiModelProperty(value = "诊治科室id", name = "treatDepId", example = "2", required = true)
    private Integer treatDepId;

    /**
     * 诊治医生id
     */
    @ApiModelProperty(value = "诊治医生id", name = "treatDocId", example = "1", required = true)
    private Integer treatDocId;

    /**
     * 诊治患者id
     */
    @ApiModelProperty(value = "诊治患者id", name = "treatUserId", example = "1", required = true)
    private Integer treatUserId;

    /**
     * 诊治价格
     */
    @ApiModelProperty(value = "诊治价格", name = "treatPrice", example = "23.6", required = true)
    private Double treatPrice;

    /**
     * 诊治状态
     */
    @ApiModelProperty(value = "诊治状态", name = "treatStatus", example = "0", required = true)
    private Integer treatStatus;

    /**
     * 诊治补充
     */
    @ApiModelProperty(value = "诊治补充", name = "treatExtra", example = "-")
    private String treatExtra;


    public Integer getTreatId() {
        return treatId;
    }

    public void setTreatId(Integer treatId) {
        this.treatId = treatId;
    }

    public Integer getTreatDepId() {
        return treatDepId;
    }

    public void setTreatDepId(Integer treatDepId) {
        this.treatDepId = treatDepId;
    }

    public Integer getTreatDocId() {
        return treatDocId;
    }

    public void setTreatDocId(Integer treatDocId) {
        this.treatDocId = treatDocId;
    }

    public Integer getTreatUserId() {
        return treatUserId;
    }

    public void setTreatUserId(Integer treatUserId) {
        this.treatUserId = treatUserId;
    }

    public Double getTreatPrice() {
        return treatPrice;
    }

    public void setTreatPrice(Double treatPrice) {
        this.treatPrice = treatPrice;
    }

    public Integer getTreatStatus() {
        return treatStatus;
    }

    public void setTreatStatus(Integer treatStatus) {
        this.treatStatus = treatStatus;
    }

    public String getTreatExtra() {
        return treatExtra;
    }

    public void setTreatExtra(String treatExtra) {
        this.treatExtra = treatExtra;
    }

}
