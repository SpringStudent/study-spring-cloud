package ning.zhou.study.springcloud.stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author 周宁
 * @Date 2019-06-20 20:24
 */
@RunWith(SpringRunner.class)
@EnableBinding(value = {SkinApplicationTests.SkinSender.class})
public class SkinApplicationTests {

    @Resource
    private SkinSender skinSender;
    @Test
    public void skinSenderTest(){
        skinSender.output().send(MessageBuilder.withPayload("wo leng nima").build());
    }

    public interface SkinSender{
        String OUTPUT = "input";

        @Output(SkinSender.OUTPUT)
        MessageChannel output();
    }

}
