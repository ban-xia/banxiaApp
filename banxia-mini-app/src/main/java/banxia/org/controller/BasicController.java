package banxia.org.controller;

import banxia.org.utils.RedisOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiexin
 * @create 2020-04-20 5:02 下午
 * @description
 */
@RestController
public class BasicController {

    @Autowired
    public RedisOperator redis;
}