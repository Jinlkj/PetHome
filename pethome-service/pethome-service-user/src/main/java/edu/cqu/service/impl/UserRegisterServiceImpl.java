package edu.cqu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import edu.cqu.common.Response;
import edu.cqu.service.UserRegisterService;
import edu.cqu.user.dtos.UserDto;
import jodd.util.StringUtil;
import org.redisson.Redisson;
import org.redisson.api.RBatch;
import org.redisson.api.RBucket;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegisterServiceImpl implements UserRegisterService {
    @Autowired
    RedissonClient redissonClient;
    @Override
    public Response register(UserDto userDto) {
//        if(StringUtil.isBlank(userDto.getPhone())){
//            return Response.error(404,"no phone",null);
//        }
//        RBucket<Object> bucket = redissonClient.getBucket(userDto.getPhone());
//        bucket.set();
        return null;
    }
}
