package be.cegeka.bibliothouris.application;

import be.cegeka.bibliothouris.domain.books.Book;
import be.cegeka.bibliothouris.domain.books.BookService;
import be.cegeka.bibliothouris.domain.users.UserService;
import org.assertj.core.api.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;


import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class UserControllerTest {

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();
    
    @InjectMocks
    private UserController userController;


    
    @Mock
    private BookService bookService;

    @Test
    public void getAllBooks_shouldActivateCorrespondingMethod() throws Exception {
        userController.getAllBooks();
        verify(bookService).getAllBooks();
    }


    @Test
    public void searchByISBN_shouldActicateCorrespondingMethod() throws Exception {
        userController.searchByISBN("123");
        verify(bookService).searchByISBN("123");
    }


    @Test
    public void searchISBNShouldReturnListOfBooks() throws Exception {
        Book testboek=new Book("test","mattia","romeo","this is a book description","123");
        List<Book> testlist=new ArrayList<>();
        testlist.add(testboek);
        when(bookService.searchByISBN("123")).thenReturn(testlist);
        Assertions.assertThat(userController.searchByISBN("123")).contains(testboek);


    }
}