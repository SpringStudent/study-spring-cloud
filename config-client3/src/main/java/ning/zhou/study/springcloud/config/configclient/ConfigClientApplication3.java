package ning.zhou.study.springcloud.config.configclient;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientApplication3 {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigClientApplication3.class).web(true).run(args);
    }

}
