package ning.zhou.study.springcloud.config.configclient.bean;

import com.gysoft.jdbc.annotation.Table;
import lombok.Data;

/**
 * @author 周宁
 * @Date 2019-06-03 11:50
 */
@Data
@Table(name = "user")
public class User {

    private Integer id;

    private String name;

    private Integer age;
}
