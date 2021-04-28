package yxz.vehicle.model.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author yangxiumei
 * @since 2021-04-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class RoadInfo implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 路段名称
     */
    private String roadName;

    /**
     * 路段起始点坐标id
     */
    private Integer startPoint;

    /**
     * 路段终点坐标id
     */
    private Integer endPoint;

    /**
     * 路段长度
     */
    private Integer roadLength;

    /**
     * 路段级别
     */
    private Integer roadRank;

    /**
     * 路段交通状况
     */
    private Integer roadCondition;


}
