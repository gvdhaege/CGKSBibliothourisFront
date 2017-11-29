package be.cegeka.bibliothouris.domain.books;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Named
public class BookRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void addBook(Book book){
        entityManager.persist(book);
    }

    public List getAllBooks() {
        return entityManager.createQuery("select b from Book b").getResultList();
    }

    public List<Book> searchByISBN(String isbn) {
        return entityManager
                .createQuery("select b from Book b where b.isbn like :isbn", Book.class)
                .setParameter("isbn", "%"+isbn+"%")
                .getResultList();
    }

    public List<Book> searchByName(String name) {
        return entityManager
                .createQuery("select b from Book b where b.authorFirstName like :name", Book.class)
                .setParameter("name", "%"+name+"%")
                .getResultList();
    }

    public List<Book> searchByTitle(String title) {
        return entityManager
                .createQuery("select b from Book b where b.title like :title", Book.class)
                .setParameter("title", "%"+title+"%")
                .getResultList();
    }

}
