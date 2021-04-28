package xyz.vehicle.client;

import org.springframework.cloud.openfeign.FeignClient;
import yxz.vehicle.yxz.vehicle.api.calculation.IPathCalculationServer;

/**
 * @author yangxiumei
 * @date 2021/4/29 0:04
 */
@FeignClient(value = "service-vehicle")
public interface PathCalculationServer extends IPathCalculationServer {

}
