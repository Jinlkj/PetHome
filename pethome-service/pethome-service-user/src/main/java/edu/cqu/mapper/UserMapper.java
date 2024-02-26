package edu.cqu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import edu.cqu.user.pojos.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
