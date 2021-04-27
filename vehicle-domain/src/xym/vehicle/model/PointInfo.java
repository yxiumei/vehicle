package xym.vehicle.model;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author yangxiumei
 * @date 2021/4/2 16:50
 */
@Data
@Accessors(chain = true)
public class PointInfo {

    /**
     * 主键id
     */
    private Long id;

    /**
     * 经度
     */
    private float longitude;

    /**
     * 纬度
     */
    private float latitude;

    /**
     * 可到达的点（json存储）
     */
    private String arrivePoint;
}
