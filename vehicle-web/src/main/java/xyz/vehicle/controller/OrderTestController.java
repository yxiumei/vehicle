package xyz.vehicle.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.vehicle.client.ProductService;

/**
 * @author yxiumei
 */
@Slf4j
@RestController
public class OrderTestController {

    @Autowired(required = false)
    private ProductService productService;

    @GetMapping("/test")
    public String test() {
        productService.product();
        return "Test";
    }

}
