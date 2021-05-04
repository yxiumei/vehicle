package xyz.vehicle.web.controller;/**
 * @Author yxiumei
 * @Data 2021/4/29 0:08
 */

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xyz.vehicle.web.client.PathCalculationService;
import yxz.vehicle.model.entity.RoadInfo;

import java.util.List;

/**
 * @author yangxiumei
 * @date 2021/4/29 0:08
 */
@RestController
@RequiredArgsConstructor
public class PathCalculationController {

    private final PathCalculationService pathCalculationServer;

    @PostMapping("/getPaths")
    public List<List<RoadInfo>> getPaths(
            @RequestParam("startPointId") Integer startPointId,
            @RequestParam("startPointId") Integer endPointId) {
        return pathCalculationServer.getPaths(startPointId, endPointId);
    }
}
