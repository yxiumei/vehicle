package yxz.vehicle.center.controller.area;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yxz.vehicle.model.entity.RoadInfo;
import yxz.vehicle.yxz.vehicle.center.service.impl.RoadInfoServiceImpl;

import java.util.Arrays;
import java.util.List;

@RestController
@Api(tags = "核心功能_范围圈定_路径")
@RequestMapping("/center/area/road")
public class DelineationAreaRoadController {

    @Autowired
    RoadInfoServiceImpl roadInfoService;

    @ApiOperation("保存面积内的所有路段")
    @PostMapping("/saveRoadInfos")
    public void fun4(RoadInfo[] roadInfos) {
        roadInfoService.saveBatch(Arrays.asList(roadInfos));
    }

    @ApiOperation("根据坐标点id获取坐标信息")
    @PostMapping("/getAllRoadInfos")
    public Object fun6(Integer id) {
        List<RoadInfo> list = roadInfoService.lambdaQuery()
                .eq(RoadInfo::getStartPoint, id)
                .list();
        return list;
    }

    @ApiOperation("移除一个路段")
    @PostMapping("/delRoadInfo")
    public void run4(Integer id) {
        roadInfoService.removeById(id);
    }

    @ApiOperation("保存面积内的一个路段")
    @PostMapping("/addRoadInfo")
    public void fun4(RoadInfo roadInfo) {
        roadInfoService.save(roadInfo);
    }

    @ApiOperation("修改面积内的一个路段")
    @PostMapping("/modifyRoadInfo")
    public void fun5(RoadInfo roadInfo) {
        roadInfoService.updateById(roadInfo);
    }

}
