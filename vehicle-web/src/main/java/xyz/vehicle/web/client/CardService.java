package xyz.vehicle.web.client;

import org.springframework.cloud.openfeign.FeignClient;
import yxz.vehicle.yxz.vehicle.api.card.ICardService;

/**
 * @author yangxiumei
 * @date 2021/5/4 16:17
 */
@FeignClient(value = "vehicle-service")
public interface CardService extends ICardService {
}
