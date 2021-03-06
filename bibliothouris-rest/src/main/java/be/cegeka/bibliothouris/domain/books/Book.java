package be.cegeka.bibliothouris.domain.books;

import javax.persistence.*;

@Entity
@Table(name = "BOOKS")
public class
Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BOOK_ID")
    private int id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "AUTHOR_FIRST_NAME")
    private String authorFirstName;

    @Column(name = "AUTHOR_LAST_NAME")
    private String authorLastName;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "ISBN")
    private String isbn;

    public Book() {
    }


    public Book(String title, String authorFirstName, String authorLastName, String description, String isbn) {
        this.title = title;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.description = description;
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return id == book.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    public int getId() {
        return id;
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

    public String getDescription() {
        return description;
    }

    public String getIsbn() {
        return isbn;
    }
}
