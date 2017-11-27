package be.cegeka.bibliothouris.domain.books;


public class BookDto {
    private String title;
    private String authorFirstName;
    private String authorLastName;
    private String isbn;

    public BookDto() {
    }

    public BookDto(String title, String authorFirstName, String authorLastName, String isbn) {
        this.title = title;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.isbn = isbn;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public String getIsbn() {
        return isbn;
    }
}
