package ning.zhou.study.springcloud.stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * @author 周宁
 * @Date 2019-06-20 20:00
 */
@EnableBinding(Sink.class)
public class SinkReceiver {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @StreamListener(Sink.INPUT)
    public void receive(Object payload){
        logger.info("Received:"+payload);
    }

}
