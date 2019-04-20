package user;

import com.thoughtworks.nho.Application;
import com.thoughtworks.nho.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;



@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class UserServiceTest {


    @Autowired
    private UserService userService;

    @Test
    public void  check_identity_when_sql_has_password_wrong(){
        Assert.assertTrue(!userService.checkIdentity("test","test"));
    }
}
