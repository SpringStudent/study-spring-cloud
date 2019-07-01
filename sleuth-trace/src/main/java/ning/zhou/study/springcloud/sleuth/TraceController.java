package ning.zhou.study.springcloud.sleuth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author 周宁
 * @Date 2019-06-27 11:22
 */
@RestController
public class TraceController {

    @Resource
    private RestTemplate restTemplate;
    private static final Logger logger = LoggerFactory.getLogger(TraceController.class);

    @GetMapping("/trace-1")
    public String trace() {
        logger.info("====call trace1====");
        return restTemplate.getForEntity("http://trace-2/trace-2", String.class).getBody();
    }


}
