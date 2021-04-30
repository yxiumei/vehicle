package yxz.vehicle.model.entity;

import java.io.Serializable;
import java.util.Objects;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoadInfo roadInfo = (RoadInfo) o;
        return Objects.equals(id, roadInfo.id) && Objects.equals(roadName, roadInfo.roadName) && Objects.equals(startPoint, roadInfo.startPoint) && Objects.equals(endPoint, roadInfo.endPoint) && Objects.equals(roadLength, roadInfo.roadLength) && Objects.equals(roadRank, roadInfo.roadRank) && Objects.equals(roadCondition, roadInfo.roadCondition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, roadName, startPoint, endPoint, roadLength, roadRank, roadCondition);
    }
}
