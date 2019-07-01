package ning.zhou.study.springcloud.sleuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SleuthTraceApplication2 {

    public static void main(String[] args) {
        SpringApplication.run(SleuthTraceApplication2.class, args);
    }

}
