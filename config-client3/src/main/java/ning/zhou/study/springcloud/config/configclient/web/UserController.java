package ning.zhou.study.springcloud.config.configclient.web;

import ning.zhou.study.springcloud.config.configclient.bean.User;
import ning.zhou.study.springcloud.config.configclient.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 周宁
 * @Date 2019-06-03 11:53
 */
@RestController
@RefreshScope
public class UserController {

    @Resource
    private UserDao userDao;
    @Value("${from}")
    private String from;

    @GetMapping("/getUsers")
    public List<User> getUsers() throws Exception {
        return userDao.queryAll();
    }

    @GetMapping("/from")
    public String from(){
        return from;
    }
}
