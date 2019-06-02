package ning.zhou.study.springcloud.eureka.eurekaconsumer.web;

import org.springframework.beans.factory.annotation.Autowired;
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
    private RestTemplate restTemplate;

    @GetMapping("/consumer")
    public String dc() {
        String url = "http://eureka-client/dc";
        return restTemplate.getForObject(url, String.class);
    }
}
