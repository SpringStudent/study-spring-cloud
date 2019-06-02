package ning.zhou.study.springcloud.eureka.eurekaconsumer.web;

import ning.zhou.study.springcloud.eureka.eurekaconsumer.service.DcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author 周宁
 * @Date 2019-06-01 15:40
 */
@RestController
public class DcController {

    @Autowired
    private DcService dcService;

    @GetMapping("/consumer")
    public String dc(){
        return dcService.consumer();
    }
}
