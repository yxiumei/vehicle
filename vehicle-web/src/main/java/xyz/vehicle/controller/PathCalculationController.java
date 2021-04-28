package xyz.vehicle.controller;/**
 * @Author yxiumei
 * @Data 2021/4/29 0:08
 */

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.vehicle.client.PathCalculationServer;
import yxz.vehicle.model.entity.RoadInfo;

import java.util.List;

/**
 * @author yangxiumei
 * @date 2021/4/29 0:08
 */
@RestController
@RequiredArgsConstructor
public class PathCalculationController {

    private final PathCalculationServer pathCalculationServer;

    /**
     * todo post这样接收参数可能有点问题
     */
    @PostMapping("/getPaths")
    public List<List<RoadInfo>> fun1(Integer startPointId, Integer endPointId) {
        return pathCalculationServer.fun1(startPointId, endPointId);
    }
}
