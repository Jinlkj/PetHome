package edu.cqu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import edu.cqu.user.pojos.User;

public interface UserInfoService {
    public User getUserInfoByID(String id);
}
