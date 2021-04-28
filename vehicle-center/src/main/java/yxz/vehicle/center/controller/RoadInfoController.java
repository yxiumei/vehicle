package yxz.vehicle.center.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yangxiumei
 * @since 2021-04-28
 */
@Slf4j
@RestController
@RequestMapping("/model/road-info")
public class RoadInfoController {

    @GetMapping("/show")
    private void get() {
        log.info("请求到了这台服务器。。。。");
    }

}

