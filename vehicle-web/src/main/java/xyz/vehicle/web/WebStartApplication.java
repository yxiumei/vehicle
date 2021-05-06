package xyz.vehicle.web;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author yxiumei
 */
@EnableFeignClients
@SpringBootApplication
@EnableSwagger2Doc // 开启API文档在线查看 // http://localhost/swagger-ui.html
@EnableDiscoveryClient
public class WebStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebStartApplication.class);
    }

}
