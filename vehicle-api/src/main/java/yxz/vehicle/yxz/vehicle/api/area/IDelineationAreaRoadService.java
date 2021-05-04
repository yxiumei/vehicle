package yxz.vehicle.yxz.vehicle.api.area;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yxz.vehicle.model.entity.RoadInfo;

import java.util.Arrays;
import java.util.List;

/**
 * @author yangxiumei
 */
@RestController
@Api(tags = "核心功能_范围圈定_路径")
@RequestMapping("/center/area/road")
public interface IDelineationAreaRoadService {

    @ApiOperation("保存面积内的所有路段")
    @PostMapping("/saveRoadInfos")
    void saveRoadInfos(RoadInfo[] roadInfos);

    @ApiOperation("根据坐标点id获取坐标信息")
    @PostMapping("/getAllRoadInfos")
    List<RoadInfo> getAllRoadInfos(Integer id);

    @ApiOperation("移除一个路段")
    @PostMapping("/delRoadInfo")
    void delRoadInfo(Integer id);

    @ApiOperation("保存面积内的一个路段")
    @PostMapping("/addRoadInfo")
    void addRoadInfo(RoadInfo roadInfo);

    @ApiOperation("修改面积内的一个路段")
    @PostMapping("/modifyRoadInfo")
    void modifyRoadInfo(RoadInfo roadInfo);

}
