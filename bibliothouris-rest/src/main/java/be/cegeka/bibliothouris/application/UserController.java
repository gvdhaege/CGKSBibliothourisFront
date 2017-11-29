package be.cegeka.bibliothouris.application;

import be.cegeka.bibliothouris.domain.books.Book;
import be.cegeka.bibliothouris.domain.books.BookDto;
import be.cegeka.bibliothouris.domain.books.BookService;
import be.cegeka.bibliothouris.domain.users.User;
import be.cegeka.bibliothouris.domain.users.UserDto;
import be.cegeka.bibliothouris.domain.users.UserService;
import org.springframework.http.MediaType;
import org.springframework.security.access.annotation.Secured;
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
    @Secured("ROLE_ADMIN")
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    @PostMapping(path = "/addUser", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addUser(@RequestBody UserDto userDto) {
        userService.addUser(userDto);
    }

    @Secured("ROLE_LIBRARIAN")
    @PostMapping(path = "/addBook", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addBook(@RequestBody BookDto bookDto) {
        bookService.addBook(bookDto);
    }

    @Secured("ROLE_USER")
    @RequestMapping(path = "/allBooks")
    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @Secured("ROLE_USER")
    @RequestMapping(path = "/searchByISBN")
    @GetMapping
    public List<Book> searchByISBN(@RequestParam(value = "isbn", required = true) String isbn) {
        return bookService.searchByISBN(isbn);
    }
    @Secured("ROLE_USER")
    @RequestMapping(path = "/searchByTitle")
    @GetMapping
    public List<Book> searchByTitle(@RequestParam(value = "title", required = true) String title) {
        return bookService.searchByTitle(title);
    }

    @Secured("ROLE_USER")
    @RequestMapping(path = "/searchByName")
    @GetMapping
    public List<Book> searchByName(@RequestParam(value = "name", required = true) String name) {
        return bookService.searchByName(name);
    }

}
