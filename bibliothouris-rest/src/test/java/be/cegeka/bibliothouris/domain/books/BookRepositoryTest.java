package be.cegeka.bibliothouris.domain.books;

import be.cegeka.bibliothouris.Application;
import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.util.ReflectionTestUtils;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = Application.class)
@Transactional
public class BookRepositoryTest {

    @PersistenceContext
    private EntityManager entityManager;

    @Inject
    private BookRepository bookRepository;

    private Book testBoek;
    private Book testBoek2;
    private Book testBoek3;


    @Before
    public void setUp(){
    testBoek = new Book("title", "first", "last", "this is a book description", "isbn");
    testBoek2 = new Book("nogEenTitel", "Voornaam", "Achternaam", "this is a book description", "56556");
    testBoek3 = new Book("nogEenTitel", "Voornaam", "Achternaam", "this is a book description", "123");
    entityManager.persist(testBoek3);
    }

    @Test
    public void addBook_shouldAddBookToDb() throws Exception {
        bookRepository.addBook(testBoek);
        Assertions.assertThat(entityManager.find(Book.class, testBoek.getId())).isEqualTo(testBoek);
    }

    @Test
    public void getAllBooks_shouldReturnAllBooks() throws Exception {
        bookRepository.addBook(testBoek);
        bookRepository.addBook(testBoek2);

        Assertions.assertThat(bookRepository.getAllBooks()).contains(testBoek, testBoek2);
    }

    @Test
    public void searchByIsbnShouldReturnCorrectBook() throws Exception {
        Assertions.assertThat(bookRepository.searchByISBN("123")).contains(testBoek3);
    }
    @Test
    public void searchByTitleShouldReturnCorrectBook() throws Exception {
        Assertions.assertThat(bookRepository.searchByTitle("nogEenTitel")).contains(testBoek3);
    }
    @Test
    public void searchByNameShouldReturnCorrectBook() throws Exception {
        Assertions.assertThat(bookRepository.searchByName("Voornaam")).contains(testBoek3);
    }
}