package edu.cqu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import edu.cqu.common.Response;
import edu.cqu.user.dtos.UserDto;
import edu.cqu.user.pojos.User;

public interface UserLoginService extends IService<User> {
    public Response login(UserDto userDto);
}
