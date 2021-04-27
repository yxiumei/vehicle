package xym.vehicle.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @author yangxiumei
 * @date 2021/4/2 17:10
 */
@Data
@Accessors(chain = true)
public class CardInfo {

    /**
     * 主键id
     */
    private Long id;

    /**
     * 车辆名称
     */
    private String name;

    /**
     * 创建时间
     */
    private Date createAt;

    /**
     * 更新时间
     */
    private Date updateAt;
}
