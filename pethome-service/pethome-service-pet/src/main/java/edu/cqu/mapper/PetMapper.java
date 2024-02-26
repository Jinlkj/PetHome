package edu.cqu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import edu.cqu.pet.pojos.Pet;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PetMapper extends BaseMapper<Pet> {
}
