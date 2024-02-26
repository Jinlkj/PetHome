package edu.cqu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import edu.cqu.common.Response;
import edu.cqu.mapper.UserMapper;
import edu.cqu.service.UserLoginService;
import edu.cqu.user.dtos.UserDto;
import edu.cqu.user.pojos.User;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginServiceImpl extends ServiceImpl<UserMapper, User> implements UserLoginService {
    @Override
    public Response login(UserDto userDto) {
//        TODO: Check if login info is right

        return Response.okResult(200,"",getById(userDto.getId()));
    }
}
