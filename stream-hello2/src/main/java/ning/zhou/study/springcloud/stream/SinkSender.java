package ning.zhou.study.springcloud.stream;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.support.GenericMessage;

/**
 * @author 周宁
 * @Date 2019-06-24 17:57
 */
@EnableBinding(value = {Source.class})
public class SinkSender {

    @Bean
    @InboundChannelAdapter(value = Source.OUTPUT,poller = @Poller(fixedDelay = "2000"))
    public MessageSource<String> timerMessageSource(){
        return () -> new GenericMessage<>("{\"name\":\"didi\", \"age\":30}");
    }
}
