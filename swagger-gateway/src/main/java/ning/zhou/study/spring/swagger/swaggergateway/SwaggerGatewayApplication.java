package ning.zhou.study.spring.swagger.swaggergateway;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.List;

@EnableSwagger2Doc
@EnableZuulProxy
@SpringCloudApplication
public class SwaggerGatewayApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SwaggerGatewayApplication.class).web(true).run(args);
    }

    @Component
    @Primary
    class DocumentationConfig implements SwaggerResourcesProvider {
        @Override
        public List<SwaggerResource> get() {
            List resources = new ArrayList();
            resources.add(swaggerResource("service-a", "/swagger-servicea/v2/api-docs", "2.0"));
            resources.add(swaggerResource("service-b", "/swagger-serviceb/v2/api-docs", "2.0"));
            return resources;
        }
    }

    private SwaggerResource swaggerResource(String name, String location, String version) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(location);
        swaggerResource.setSwaggerVersion(version);
        return swaggerResource;
    }

}
