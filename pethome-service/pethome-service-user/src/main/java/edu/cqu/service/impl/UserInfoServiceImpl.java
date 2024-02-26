package edu.cqu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import edu.cqu.mapper.UserMapper;
import edu.cqu.service.UserInfoService;
import edu.cqu.user.pojos.User;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl extends ServiceImpl<UserMapper, User> implements UserInfoService {
    @Override
    public User getUserInfoByID(String id) {
        User user = getById(id);
        return user;
    }
}
