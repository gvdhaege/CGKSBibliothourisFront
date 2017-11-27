package be.cegeka.bibliothouris.domain.books;


public class BookDto {
    private String title;
    private String authorFirstName;
    private String authorLastName;
    private String isbn;
    private String lastName;
    private String firstName;

    public BookDto(){}

    public BookDto(String title, String authorFirstName, String authorLastName, String isbn) {
        this.title = title;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.isbn = isbn;
    }


    public String getIsbn() {
        return isbn;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getTitle() {
        return title;
    }
}
