package yxz.vehicle.yxz.vehicle.api.calculation;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import yxz.vehicle.model.entity.RoadInfo;

import java.util.List;

/**
 * 对外暴露核心功能_路径计算服务
 * @author yangxiumei
 * @date 2021/4/28 23:52
 */
@RestController
@Api(tags = "核心功能_路径计算")
@RequestMapping("/center/calculation")
public interface IPathCalculationService {

    @ApiOperation("根据指定两个地点信息获取能到达的所有路径(按距离从小到大排序)")
    @GetMapping("/getPaths")
    List<List<RoadInfo>> getPaths(
            @RequestParam("startPointId") Integer startPointId,
            @RequestParam("endPointId") Integer endPointId);
}
