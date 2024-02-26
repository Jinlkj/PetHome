package edu.cqu.controller;

import edu.cqu.common.Response;
import edu.cqu.pet.dtos.PetDto;
import edu.cqu.pet.pojos.Pet;
import edu.cqu.service.PetInfoService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pet")
@Api(value = "重庆信息查询", tags = "宠物", description = "app端宠物信息查询API")
public class PetInfoController {
    @Autowired
    PetInfoService petInfoService;
    @PostMapping("/info")
    public Pet getInfo(@RequestBody PetDto petDto){
        Pet pet = petInfoService.getPetInfo(petDto.getId());
        return pet;
    }
    @PostMapping("/process")
    public Response processPic(@RequestParam String picUrl){

        return Response.okResult(200,"",null);
    }
}
