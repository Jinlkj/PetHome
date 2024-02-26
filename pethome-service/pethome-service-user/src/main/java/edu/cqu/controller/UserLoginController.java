package edu.cqu.controller;

import edu.cqu.common.Response;
import edu.cqu.service.UserLoginService;
import edu.cqu.service.UserRegisterService;
import edu.cqu.user.dtos.UserDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@Api(value = "用户登录", tags = "用户", description = "app端用户登录API")
public class UserLoginController {
    @Autowired
    UserLoginService userLoginService;
    @Autowired
    UserRegisterService userRegisterService;
    @ApiOperation("用户登录")
    @PostMapping("/login")
    public Response userLogin(@RequestBody UserDto userDto){

        return userLoginService.login(userDto);
    }
    @GetMapping("/test")
    public Response testGateway(@RequestParam Integer id){
        return Response.okResult(200,"You are here",id);
    }
}
