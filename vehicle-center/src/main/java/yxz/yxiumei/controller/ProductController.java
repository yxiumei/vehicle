package yxz.yxiumei.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yxiumei
 */
@Slf4j
@RestController
public class ProductController {


    @GetMapping("/product")
    private void get() {
        log.info("请求到了这台服务器。。。。");
    }
}
