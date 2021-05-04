package yxz.vehicle.center.area;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import yxz.vehicle.center.service.IRoadInfoService;
import yxz.vehicle.model.entity.RoadInfo;
import yxz.vehicle.yxz.vehicle.api.area.IDelineationAreaRoadService;

import java.util.Arrays;
import java.util.List;

/**
 * @author yangxiumei
 */
@Service
@RequiredArgsConstructor
public class DelineationAreaRoadServiceImpl implements IDelineationAreaRoadService {

    private final IRoadInfoService roadInfoService;;
    @Override
    public void saveRoadInfos(RoadInfo[] roadInfos) {
        roadInfoService.saveBatch(Arrays.asList(roadInfos));
    }

    @Override
    public List<RoadInfo> getAllRoadInfos(Integer id) {
        return roadInfoService.lambdaQuery()
                .eq(RoadInfo::getStartPoint, id)
                .list();
    }

    @Override
    public void delRoadInfo(Integer id) {
        roadInfoService.removeById(id);
    }

    @Override
    public void addRoadInfo(RoadInfo roadInfo) {
        roadInfoService.save(roadInfo);
    }

    @Override
    public void modifyRoadInfo(RoadInfo roadInfo) {
        roadInfoService.updateById(roadInfo);
    }
}
