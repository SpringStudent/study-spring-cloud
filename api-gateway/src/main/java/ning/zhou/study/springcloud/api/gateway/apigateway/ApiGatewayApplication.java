package ning.zhou.study.springcloud.api.gateway.apigateway;

import ning.zhou.study.springcloud.api.gateway.apigateway.token.AccessFilter;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringCloudApplication
public class ApiGatewayApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ApiGatewayApplication.class).web(true).run(args);
    }

    @Bean
    public AccessFilter accessFilter(){
        return new AccessFilter();
    }

}
