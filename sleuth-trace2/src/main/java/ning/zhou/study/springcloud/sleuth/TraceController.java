package ning.zhou.study.springcloud.sleuth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 周宁
 * @Date 2019-06-27 11:22
 */
@RestController
public class TraceController {

    private static final Logger logger = LoggerFactory.getLogger(TraceController.class);

    @GetMapping("/trace-2")
    public String trace(HttpServletRequest request) {
        logger.info("====<call trace2,TraceId={}.SpanId={}>====",request.getHeader("X-B3-TraceId"),request.getHeader("X-B3-SpanId"));
        return "Trace";
    }


}
