package ning.zhou.study.springcloud.swagger.serviceb.swaggerserviceb;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableSwagger2Doc
@EnableDiscoveryClient
@SpringBootApplication
public class SwaggerServicebApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SwaggerServicebApplication.class).web(true).run(args);
    }

    @RestController()
    class BbbbController {

        @Autowired
        private DiscoveryClient discoveryClient;

        @GetMapping("/getServices")
        public String getServices() {
            return "Services:" + discoveryClient.getServices();
        }
    }
}
