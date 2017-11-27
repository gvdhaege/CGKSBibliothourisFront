package be.cegeka.bibliothouris.domain.books;

import be.cegeka.bibliothouris.Application;
import org.assertj.core.api.Assertions;
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

    @Before
    public void setUp(){
    testBoek = new Book("title", "first", "last", "isbn");

    }

    @Test
    public void addBook_shouldAddBookToDb() throws Exception {
        bookRepository.addBook(testBoek);
        Assertions.assertThat(entityManager.find(Book.class, testBoek.getId())).isEqualTo(testBoek);

    }
}