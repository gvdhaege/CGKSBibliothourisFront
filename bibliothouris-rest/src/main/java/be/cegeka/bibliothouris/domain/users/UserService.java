package be.cegeka.bibliothouris.domain.users;

import be.cegeka.bibliothouris.domain.books.BookRepository;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Named
public class UserService {

    @Inject
    private UserRepository userRepository;

    public void addUser(String name){
        userRepository.addUser(new User(name));
    }

    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

}
