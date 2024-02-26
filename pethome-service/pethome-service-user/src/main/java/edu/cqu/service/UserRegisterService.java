package edu.cqu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import edu.cqu.user.dtos.UserDto;
import edu.cqu.user.pojos.User;

public interface UserRegisterService {
    public void register(UserDto userDto);
}
