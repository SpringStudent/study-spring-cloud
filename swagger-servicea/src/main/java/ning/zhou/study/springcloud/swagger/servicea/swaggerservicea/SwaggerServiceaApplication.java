package ning.zhou.study.springcloud.swagger.servicea.swaggerservicea;

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
public class SwaggerServiceaApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SwaggerServiceaApplication.class).web(true).run(args);
    }

    @RestController
    class AaaController{
        @Autowired
        DiscoveryClient discoveryClient;

        @GetMapping("/service-a")
        public String getService(){
            return "Services:"+discoveryClient.getServices();
        }

    }

}
