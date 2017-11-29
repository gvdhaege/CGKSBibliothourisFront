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
}