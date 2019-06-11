package ning.zhou.study.springcloud.eureka.eurekaconsumer.service;

import org.springframework.stereotype.Component;

/**
 * @author 周宁
 * @Date 2019-06-11 10:59
 */
@Component
public class DcServiceFallback implements DcService{
    @Override
    public String consumer() {
        return "fallback";
    }
}
