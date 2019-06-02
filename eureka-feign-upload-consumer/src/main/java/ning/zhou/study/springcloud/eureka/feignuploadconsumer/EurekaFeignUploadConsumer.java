package ning.zhou.study.springcloud.eureka.feignuploadconsumer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author 周宁
 * @Date 2019-06-02 10:16
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class EurekaFeignUploadConsumer {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaFeignUploadConsumer.class).web(true).run(args);
    }
}
