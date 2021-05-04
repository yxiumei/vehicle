//package yxz.vehicle.center.controller.calculation;
//
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import yxz.vehicle.model.entity.RoadInfo;
//import yxz.vehicle.center.service.impl.RoadInfoServiceImpl;
//
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Slf4j
//@RestController
//@Api(tags = "核心功能_路径计算")
//@RequestMapping("/center/calculation")
//public class PathCalculationController {
//
//    @Autowired
//    RoadInfoServiceImpl roadInfoService;
//
//    @ApiOperation("根据指定两个地点信息获取能到达的所有路径(按距离从小到大排序)")
//    @PostMapping("/getPaths")
//    public Object fun1(Integer startPointId, Integer endPointId) {
//        if (startPointId.equals(endPointId)) {
//            throw new RuntimeException("起点和终点不能一样");
//        }
//        // 获取所有数据(数据量小的时候可以, 如果数据量大那就必须实时获取)
//        List<RoadInfo> list = roadInfoService.list();
//        // 清除之前的数据
//        globalList.clear();
//        // 执行路径查询程序
//        getAllPath(list, new ArrayList<>(), startPointId, endPointId);
//        // 对所有可能的路径按总长度排序
//        globalList = globalList.stream()
//                .sorted((a, b)-> {
//                    int sumA = a.stream().mapToInt(RoadInfo::getRoadLength).sum();
//                    int sumB = b.stream().mapToInt(RoadInfo::getRoadLength).sum();
//                    return sumA-sumB;
//                }).collect(Collectors.toList());
//        return globalList;
//    }
//
//    private List<List<RoadInfo>> globalList  = new ArrayList<>();
//
//    /**
//     * 从所有数据中遍历出所有以起始点为开始的路径大小
//     * @param all 所有数据(不修改)
//     * @param oneRoad 一条路
//     * @param startPointId  起点id
//     * @param endPointId 终点id
//     */
//    private void getAllPath(List<RoadInfo> all, List<RoadInfo> oneRoad, Integer startPointId,Integer endPointId) {
//        // 从所有数据中找出以startPointId开始的路段(如果需要动态获取数据, 去掉all, 直接根据startPointId从数据库中取数据即可)
//        List<RoadInfo> startPaths = all.stream()
//                .filter(
//                        roadInfo -> roadInfo.getStartPoint().equals(startPointId)
//                ).sorted(Comparator.comparingInt(RoadInfo::getRoadLength))
//                .collect(Collectors.toList());
//        // 循环所有找到的路段(假定数据中没有某一点到自身距离为0的路段)
//        for (RoadInfo startRoadInfo : startPaths) {
//            if (oneRoad.stream().anyMatch(x-> x.getStartPoint().equals(startRoadInfo.getStartPoint()))) {
//                // 这一次的起点已经找过的跳过
//                continue;
//            }
//            if (oneRoad.stream().anyMatch(x-> x.getStartPoint().equals(startRoadInfo.getEndPoint()))) {
//                // 这一次的终点已经找过的跳过
//                continue;
//            }
//            List<RoadInfo> oneNewRoad = new ArrayList<>(oneRoad);
//            // 下面这两个都需要就单独提取出来
//            oneNewRoad.add(startRoadInfo);
//            // 与目标相同, 找到了, 加入总集合中
//            if (startRoadInfo.getEndPoint().equals(endPointId)) {
//                // 如果只需要找出最大的那一组路径, 只需要在添加的时候判断和全局里面的总长度谁更小,小的就放进去,大的移除
//                globalList.add(oneNewRoad);
//            } else { // 与目标不同, 进入子循环
//                getAllPath(all, oneNewRoad, startRoadInfo.getEndPoint(), endPointId);
//            }
//        }
//    }
//
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
