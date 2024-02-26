package edu.cqu.form;

import edu.cqu.pet.pojos.Pet;
import edu.cqu.user.pojos.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserPetForm {
    Pet pet;
    User user;
}
