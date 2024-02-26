package edu.cqu;
import edu.cqu.pet.pojos.Pet;
import edu.cqu.service.PetInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@SpringBootTest(classes = PetServiceAPP.class)
@RunWith(SpringRunner.class)
public class testPetInfo {
    @Autowired
    PetInfoService petInfoService;
    @Test
    public void testPet(){
        Pet pet =petInfoService.getPetInfo("1");
        System.out.println(pet);
    }
}
