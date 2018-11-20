package Dao;

import com.demo.dao.UserDao;
import com.demo.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import javax.annotation.Resource;

/**
 * @author: MGZ
 * @date: 2017/8/19
 */
@RunWith(SpringJUnit4ClassRunner.class) //指定测试用例的运行器 这里是指定了Junit4
@ContextConfiguration("classpath*:spring-mybatis.xml")
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)//默认回滚,即此类中的方法即使执行成功,数据也并不会真正的修改,方法执行后会回滚.
public class UserDaoTest {

    @Resource
    private UserDao userDao;

    @Test
    public void selectUserById(){
        User user = userDao.selectUserById(1);
        System.out.println(user.getUsername());
    }
}
