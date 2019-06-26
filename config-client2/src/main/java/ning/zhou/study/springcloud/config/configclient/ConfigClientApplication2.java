package ning.zhou.study.springcloud.config.configclient;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientApplication2 {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigClientApplication2.class).web(true).run(args);
    }

}
