package be.cegeka.bibliothouris.domain.books;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;
import sun.reflect.Reflection;

import static org.junit.Assert.*;

public class BookMapperTest {
    @Test
    public void createBookFromDto_givenABookDto_shouldReturnBook() throws Exception {
        BookDto bookDto = new BookDto("titles for dummies", "tbow", "kastaars", "1337");
        Book expected = new Book("titles for dummies", "tbow", "kastaars", "1337");
        ReflectionTestUtils.setField(expected, "id", 1);
        BookMapper bookMapper = new BookMapper();
        Book actual = bookMapper.createBookFromDto(bookDto);
        ReflectionTestUtils.setField(actual, "id", 1);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}