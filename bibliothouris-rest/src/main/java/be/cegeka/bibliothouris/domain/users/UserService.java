package be.cegeka.bibliothouris.domain.users;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
public class UserService {

    @Inject
    private UserRepository userRepository;

    @Inject
    private UserMapper userMapper;

    public void addUser(UserDto userDto){
        userRepository.addUser(userMapper.createUserFromDto(userDto));
    }

    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

}
