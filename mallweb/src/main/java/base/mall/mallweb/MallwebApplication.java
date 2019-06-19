package base.mall.mallweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(value="base.mall.order.service.api")
public class MallwebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallwebApplication.class, args);
    }

}
