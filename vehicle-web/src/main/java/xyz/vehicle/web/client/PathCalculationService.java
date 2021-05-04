package xyz.vehicle.web.client;

import org.springframework.cloud.openfeign.FeignClient;
import yxz.vehicle.yxz.vehicle.api.calculation.IPathCalculationService;

/**
 * @author yangxiumei
 * @date 2021/4/29 0:04
 */
@FeignClient(value = "vehicle-service")
public interface PathCalculationService extends IPathCalculationService {

}
