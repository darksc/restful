package userTest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hdsx.restful.models.User;
import com.hdsx.restful.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
// 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class UserTest {

//    private ApplicationContext ac = null;

    @Resource
    private UserService userService = null;

//     @Before
//     public void before() {
//     ac = new ClassPathXmlApplicationContext("spring-mvc.xml");
//     userService = (UserService) ac.getBean("userService");
//     }

    @Test
    public void userByIdTest() {
        User user = userService.getUserById(1);
        System.out.println(user.getUserName());
    }

    @Test
    public void insertUsersTest() {
        List<User> users = new ArrayList<User>();
        for(int i=1;i<5;i++){
            User user = new User();
            user.setAge(i);
            user.setPassword(i+"111111");
            user.setUserName("测试"+i);
            users.add(user);
        }
        this.userService.insertUsers(users);
    }
}
