package be.cegeka.bibliothouris.domain.books;

import javax.inject.Named;

@Named
public class BookMapper {

    private Book book;

    public Book createBookFromDto(BookDto bookDto){
        return book = new Book(bookDto.getTitle(), bookDto.getAuthorFirstName(), bookDto.getAuthorLastName(), bookDto.getDescription(), bookDto.getIsbn());
    }

}
