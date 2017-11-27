package be.cegeka.bibliothouris.application;

import be.cegeka.bibliothouris.domain.books.Book;
import be.cegeka.bibliothouris.domain.books.BookDto;
import be.cegeka.bibliothouris.domain.books.BookService;
import be.cegeka.bibliothouris.domain.users.User;
import be.cegeka.bibliothouris.domain.users.UserService;
import org.springframework.http.MediaType;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping(path = "/user")
@Transactional
public class UserController {

    @Inject
    private UserService userService;

    @Inject
    private BookService bookService;

    @GetMapping
    @Secured("ROLE_USER")
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public void addUser(@RequestParam(value = "name", required = true) String name) {
        userService.addUser(name);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addBook(@RequestBody BookDto bookDto){
        bookService.addBook(bookDto);
    }

    @RequestMapping(path = "/allBooks")
    @GetMapping
    public List<Book> getAllBooks() {
       return bookService.getAllBooks();
    }
}
