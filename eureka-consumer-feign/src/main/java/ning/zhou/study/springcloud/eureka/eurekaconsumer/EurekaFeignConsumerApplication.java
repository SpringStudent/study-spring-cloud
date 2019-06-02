package ning.zhou.study.springcloud.eureka.eurekaconsumer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class EurekaFeignConsumerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaFeignConsumerApplication.class).web(true).run(args);
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
