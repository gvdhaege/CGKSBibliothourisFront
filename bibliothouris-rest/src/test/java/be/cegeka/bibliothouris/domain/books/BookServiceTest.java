package be.cegeka.bibliothouris.domain.books;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.Arrays;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class BookServiceTest {

    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private BookService bookService;

    @Mock
    private BookRepository bookRepository;

    @Mock
    private BookMapper bookMapper;

    private BookDto bookDto;

    @Before
    public void setUp() throws Exception {
        book1 = new Book("titel", "voornaam", "achternaam", "123");
        book2 = new Book("Gerri de Fixer", "Gerri", "vdhaege", "12555");
        book3 = new Book("Erwin's Angels", "Erwin", "Jacobs", "127553");
        book4 = new Book("nieuw boekje", "Mattia", "Romeo", "1288953");
    }

    @Test
    public void getAllBooks_shouldCallOnCorrrespondingMethod() throws Exception {
        bookRepository.addBook(book1);
        bookRepository.addBook(book2);
        bookRepository.addBook(book3);
        bookRepository.addBook(book4);

        when(bookRepository.getAllBooks()).thenReturn(Arrays.asList(book1, book2, book3, book4));

        Assertions.assertThat(bookService.getAllBooks()).containsOnly(book1, book2, book3, book4);
    }

    @Test
    public void addBook_shouldCallOnBookRepository() throws Exception {
        bookService.addBook(new BookDto("titel", "voornaam", "achetrnaam" ,"123"));
        verify(bookRepository).addBook(bookMapper.createBookFromDto(bookDto));
    }
}