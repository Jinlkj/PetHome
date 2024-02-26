package edu.cqu.user.pojos;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("table_user")
public class User {
    @TableId(value = "id", type = IdType.AUTO)
    String id;

    String name;

    String phone;

    String age;

    String sex;

    String image;

    String kind;

    String userPet;

    String password;

    Integer salt;
}
