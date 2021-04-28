package yxz.vehicle;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yxiumei
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2Doc // 开启API文档在线查看 // http://localhost/swagger-ui.html
@MapperScan("yxz.vehicle.model.mapper")
public class ProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class);
    }

}


