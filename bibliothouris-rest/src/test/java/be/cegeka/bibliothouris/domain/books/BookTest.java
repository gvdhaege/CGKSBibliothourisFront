package be.cegeka.bibliothouris.domain.books;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void bookWithSameID_shouldBeEqualToItself() throws Exception {
        Book testBoek = new Book("Title", "First", "Last","this is a book description", "123456789");
        Book testBoek2 = new Book("Titties", "First2", "Last2", "this is a book description", "123456780");
        ReflectionTestUtils.setField(testBoek, "id", 1);
        ReflectionTestUtils.setField(testBoek2, "id", 1);
        Assertions.assertThat(testBoek).isEqualTo(testBoek2);
    }

    @Test
    public void bookWithNullID_shouldNotBeEqualToABookWithAnId() throws Exception {
        Book testBoek = new Book("Title", "First", "Last","this is a book description", "123456789");
        Book testBoek2 = new Book("Titties", "First2", "Last2","this is a book description", "123456780");
        ReflectionTestUtils.setField(testBoek, "id", 1);
        Assertions.assertThat(testBoek).isNotEqualTo(testBoek2);
    }

    @Test
    public void book_shouldBeEqualToSameBook() throws Exception {
        Book testBoek = new Book("Title", "First", "Last","this is a book description", "123456789");
        ReflectionTestUtils.setField(testBoek, "id", 1);
        Assertions.assertThat(testBoek).isEqualTo(testBoek);
    }

    @Test
    public void book_shouldNotBeEqualToADifferentClass() throws Exception {
        Book testBoek = new Book("Title", "First", "Last","this is a book description", "123456789");
        ReflectionTestUtils.setField(testBoek, "id", 1);
        Assertions.assertThat(testBoek).isNotEqualTo(new Object());
    }

    @Test
    public void book_shouldNotBeEqualToNullObject() throws Exception {
        Book testBoek = new Book("Title", "First", "Last","this is a book description", "123456789");
        ReflectionTestUtils.setField(testBoek, "id", 1);
        Assertions.assertThat(testBoek).isNotEqualTo(null);
    }


}