package ning.zhou.study.springcloud.eureka.eurekaconsumer.web;

import ning.zhou.study.springcloud.eureka.eurekaconsumer.service.ConsumerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 周宁
 * @Date 2019-06-01 15:40
 */
@RestController
public class DcController {

    @Resource
    private ConsumerService consumerService;

    @GetMapping("/consumer")
    public String dc() {
        return consumerService.consumer();
    }
}
