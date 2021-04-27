package xyz.yxiumei.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author yxiumei
 */
@FeignClient(value = "service-product")
public interface ProductService {

    @GetMapping("/product")
    void product();
}
