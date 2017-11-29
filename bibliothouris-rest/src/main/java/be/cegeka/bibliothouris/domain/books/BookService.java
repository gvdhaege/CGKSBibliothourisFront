package be.cegeka.bibliothouris.domain.books;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
public class BookService {

    @Inject
    private BookRepository bookRepository;

    @Inject
    private BookMapper bookMapper;

    public void addBook(BookDto bookDto){
        bookRepository.addBook(bookMapper.createBookFromDto(bookDto));
    }

    public List<Book> getAllBooks() {
        return  bookRepository.getAllBooks();
    }

    public List<Book> searchByISBN(String isbn) {
        return bookRepository.searchByISBN(isbn);
    }
}
