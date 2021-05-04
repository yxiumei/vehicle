package yxz.vehicle.yxz.vehicle.api.area;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import yxz.vehicle.model.entity.PointInfo;

import java.util.List;

/**
 * @author yangxiumei
 */
@RestController
@Api(tags = "核心功能_范围圈定_点")
@RequestMapping("/center/calculation")
public interface IDelineationAreaPointService {

    @PostMapping("/savePoints")
    @ApiOperation("保存面积内的所有点数据")
    void savePoints(@RequestBody List<PointInfo> pointInfos);

    @ApiOperation("获取面积内的所有点数据")
    @GetMapping("/getPoints")
    List<PointInfo> getPoints();

    @ApiOperation("删除面积内的所有点数据")
    @PostMapping("/delPoints")
    void delPoints();

    @ApiOperation("根据坐标点id获取坐标信息")
    @PostMapping("/getPoint")
    PointInfo getPoint(Integer id);

    @ApiOperation("根据坐标点信息添加坐标信息")
    @PostMapping("/addPoint")
    void addPoint(PointInfo pointInfo);

    @ApiOperation("根据坐标点信息修改坐标信息")
    @PostMapping("/modifyPoint")
    void modifyPoint(PointInfo pointInfo);

}
