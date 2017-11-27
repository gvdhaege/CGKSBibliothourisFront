package be.cegeka.bibliothouris.domain.books;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class BookService {

    @Inject
    private BookRepository bookRepository;

    @Inject
    private BookMapper bookMapper;

    public void addBook(BookDto bookDto){
        bookRepository.addBook(bookMapper.createBookFromDto(bookDto));
    }

}
