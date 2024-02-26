package edu.cqu;

import edu.cqu.common.Response;
import edu.cqu.service.UserLoginService;
import edu.cqu.user.dtos.UserDto;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@SpringBootTest(classes = UserServiceApp.class)
@RunWith(SpringRunner.class)
public class LoginTest {
    @Autowired
    UserLoginService userLoginService;
    @Test
    public void login(){
        Response response = userLoginService.login(new UserDto("1", ""));
        System.out.println(response);
    }
}
