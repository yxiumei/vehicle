package xyz.vehicle.client;

import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import yxz.vehicle.model.entity.CardInfo;

/**
 * @author yxiumei
 */
@FeignClient(value = "service-product")
public interface ProductService {

    @GetMapping("/product")
    void product();

    @PostMapping("/center/card/getOneByPhone")
    CardInfo getOneCardInfoByPhone(@RequestParam String phone);

    @PostMapping("/center/card/getOneById")
    CardInfo getOneCardInfoById(@RequestParam Integer cardId);

}
