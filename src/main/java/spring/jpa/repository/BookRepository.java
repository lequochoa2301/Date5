package spring.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import spring.jpa.entity.BookEntity;

import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<BookEntity, Integer> {
    List<BookEntity> findByAuthor(String author);
//    List<BookEntity> findByNameAndAuthor(String name, String author);
//
//    List<BookEntity> findByNameOrAuthor(String name , String author);
//
//    BookEntity findByBookDetailsIsbn(String Isbn);
//
//    List<BookEntity> findByBookDetailsPriceLessThan(int price);
//    List<BookEntity> findByBookDetailsPriceLessThanEqual(int price);
//    List<BookEntity> findByBookDetailsPriceGreaterThanEqual(int price);
//
//    List<BookEntity> findByNameContaining(String name);
//
//    List<BookEntity> getAll();
}

