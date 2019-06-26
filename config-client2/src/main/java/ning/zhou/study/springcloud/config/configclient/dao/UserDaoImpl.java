package ning.zhou.study.springcloud.config.configclient.dao;

import com.gysoft.jdbc.dao.EntityDaoImpl;
import ning.zhou.study.springcloud.config.configclient.bean.User;
import org.springframework.stereotype.Repository;

/**
 * @author 周宁
 * @Date 2019-06-03 11:51
 */
@Repository
public class UserDaoImpl extends EntityDaoImpl<User,Integer> implements UserDao{
}
