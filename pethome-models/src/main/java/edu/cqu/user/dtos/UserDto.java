package edu.cqu.user.dtos;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    @ApiModelProperty(value="用户ID",required = true)
    String id;
    @ApiModelProperty(value="手机登陆",required = true)
    String phone;
    @ApiModelProperty(value="验证码",required = false)
    String code;
    @ApiModelProperty(value="用户密码",required = false)
    String password;
}
