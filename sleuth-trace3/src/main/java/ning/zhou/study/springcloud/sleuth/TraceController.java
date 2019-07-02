package ning.zhou.study.springcloud.sleuth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author 周宁
 * @Date 2019-07-02 9:42
 */
@RestController
public class TraceController {

    @Resource
    private RestTemplate restTemplate;
    private static final Logger logger = LoggerFactory.getLogger(TraceController.class);


    @GetMapping("/trace-3")
    public String trace() {
        logger.info("====call trace3====");
        return restTemplate.getForEntity("http://trace-4/trace-4", String.class).getBody();
    }
}
