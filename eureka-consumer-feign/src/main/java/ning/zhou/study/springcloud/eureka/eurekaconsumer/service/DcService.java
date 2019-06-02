package ning.zhou.study.springcloud.eureka.eurekaconsumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 周宁
 * @Date 2019-06-02 9:31
 */
@FeignClient("eureka-client")
public interface DcService {

    @GetMapping("/dc")
    String consumer();
}
