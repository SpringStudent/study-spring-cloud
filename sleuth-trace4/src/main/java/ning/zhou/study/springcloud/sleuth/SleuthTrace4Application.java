package ning.zhou.study.springcloud.sleuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SleuthTrace4Application {

    public static void main(String[] args) {
        SpringApplication.run(SleuthTrace4Application.class, args);
    }

}
