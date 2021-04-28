package yxz.vehicle.center.controller.area;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yxz.vehicle.model.entity.PointInfo;
import yxz.vehicle.model.entity.RoadInfo;
import yxz.vehicle.model.service.impl.PointInfoServiceImpl;
import yxz.vehicle.model.service.impl.RoadInfoServiceImpl;

import java.util.Arrays;
import java.util.List;

@RestController
@Api(tags = "核心功能_范围圈定_点")
@RequestMapping("/center/area/point")
public class DelineationAreaPointController {

    @Autowired
    PointInfoServiceImpl pointInfoService;

    @PostMapping("/savePoints")
    @ApiOperation("保存面积内的所有点数据")
    public void fun1(PointInfo[] pointInfos) {
        pointInfoService.saveBatch(Arrays.asList(pointInfos));
    }

    @ApiOperation("获取面积内的所有点数据")
    @PostMapping("/getPoints")
    public Object fun2() {
        List<PointInfo> list = pointInfoService.list();
        return list;
    }

    @ApiOperation("删除面积内的所有点数据")
    @PostMapping("/delPoints")
    public void fun3() {
        pointInfoService.lambdaUpdate().remove();
    }

    @ApiOperation("根据坐标点id获取坐标信息")
    @PostMapping("/getPoint")
    public Object fun5(Integer id) {
        PointInfo point = pointInfoService.getById(id);
        return point;
    }

    @ApiOperation("根据坐标点信息添加坐标信息")
    @PostMapping("/addPoint")
    public void fun6(PointInfo pointInfo) {
        pointInfoService.save(pointInfo);
    }

    @ApiOperation("根据坐标点信息修改坐标信息")
    @PostMapping("/modifyPoint")
    public void fun7(PointInfo pointInfo) {
        pointInfoService.updateById(pointInfo);
    }

}





























