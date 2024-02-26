package edu.cqu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import edu.cqu.pet.pojos.Pet;

public interface PetInfoService extends IService<Pet> {
    public Pet getPetInfo(String petId);
}
