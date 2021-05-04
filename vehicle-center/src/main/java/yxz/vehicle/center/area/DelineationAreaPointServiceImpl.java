package yxz.vehicle.center.area;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import yxz.vehicle.center.service.IPointInfoService;
import yxz.vehicle.model.entity.PointInfo;
import yxz.vehicle.yxz.vehicle.api.area.IDelineationAreaPointService;

import java.util.List;

/**
 * @author yangxiumei
 */
@Service
@RequiredArgsConstructor
public class DelineationAreaPointServiceImpl implements IDelineationAreaPointService {

    private final IPointInfoService pointInfoService;

    @Override
    public void savePoints(List<PointInfo> pointInfos) {
        pointInfoService.saveBatch(pointInfos);
    }

    @Override
    public List<PointInfo> getPoints() {
        return pointInfoService.list();
    }

    @Override
    public void delPoints() {
        pointInfoService.lambdaUpdate().remove();
    }

    @Override
    public PointInfo getPoint(Integer id) {
        return pointInfoService.getById(id);
    }

    @Override
    public void addPoint(PointInfo pointInfo) {
        pointInfoService.save(pointInfo);
    }

    @Override
    public void modifyPoint(PointInfo pointInfo) {
        pointInfoService.updateById(pointInfo);
    }
}
