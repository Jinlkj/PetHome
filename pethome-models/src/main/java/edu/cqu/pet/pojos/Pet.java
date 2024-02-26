package edu.cqu.pet.pojos;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("table_pet")
public class Pet {
    @TableId(value = "pet_id", type = IdType.AUTO)
    String id;
    String petName;
    String petSex;
    String petType;
    String petAge;
    String petImage;
    String petMaster;
}

