package edu.cqu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import edu.cqu.mapper.PetMapper;
import edu.cqu.pet.pojos.Pet;
import edu.cqu.service.PetInfoService;
import org.springframework.stereotype.Service;

@Service
public class PetInfoServiceImpl extends ServiceImpl<PetMapper, Pet> implements PetInfoService{
    @Override
    public Pet getPetInfo(String petId) {
        Pet pet = getById(petId);
        return pet;
    }
}
