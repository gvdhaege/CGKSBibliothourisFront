package be.cegeka.bibliothouris.domain.users;

import javax.inject.Named;

@Named
public class UserMapper {

    private User user;


    public User createUserFromDto (UserDto userDto){
        user = new User(userDto.getLastName(), userDto.getInss(), userDto.getCity());
        user.withFirstName(userDto.getFirstName())
                .withStreet(userDto.getStreet())
                .withNumber(userDto.getNumber())
                .withPostalCode(userDto.getPostalCode());
        return user;
    }


}
