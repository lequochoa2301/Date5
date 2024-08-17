package spring.jpa;

import spring.jpa.config.SpringConfigJPA;
import spring.jpa.entity.BookDetailsEntity;
import spring.jpa.entity.BookEntity;
import spring.jpa.entity.CategoryEntity;
import spring.jpa.repository.BookRepository;
import spring.jpa.repository.CategoryRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;
import java.util.List;

public class Main {
    static ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigJPA.class);
    static BookRepository bookRepository = (BookRepository) context.getBean("bookRepository");
    static CategoryRepository categoryRepository = (CategoryRepository) context.getBean("categoryRepository");

    public static void main(String[] args) {
//        createNewBookEntryWithNewCategory();

//          createNewBookEntry();
        findByAuthor("Roger");
//        findByNameAndAuthor("linux", "Roger");
//        findByNameOrAuthor("linux", "Roger");
//        findByPriceLessThan(80);
//        findByBookDetailsIsbn("ISIBE1234");
//        findByNameContaining("Nu");

    }

    public static void findByAuthor(String author) {
        List<BookEntity> bookEntityList = bookRepository.findByAuthor(author);
        if (bookEntityList != null) {
            System.out.println("\nFind " + bookEntityList.size() + "book which author = " + author);
            for (BookEntity bookEntity : bookEntityList) {
                System.out.println(bookEntity.toString());
            }
        }
   }

//    public static void findByNameAndAuthor(String name, String author) {
//        List<BookEntity> bookEntityList= bookRepository.findByNameAndAuthor(name, author);
//        if(bookEntityList != null) {
//            System.out.println("\nFind " + bookEntityList.size() + "book which name = " + name + "and author = " + author);
//            for (BookEntity bookEntity: bookEntityList) {
//                System.out.println(bookEntity.toString());
//            }
//        }
//    }
//    public static void findByNameOrAuthor(String name, String author) {
//        List<BookEntity> bookEntityList= bookRepository.findByNameOrAuthor(name, author);
//        if(bookEntityList != null) {
//            System.out.println("\nFind " + bookEntityList.size() + "book which name = " + name + "or author = " + author);
//            for (BookEntity bookEntity: bookEntityList) {
//                System.out.println(bookEntity.toString());
//            }
//        }
//    }
//    public static void findByPriceLessThan(int price) {
//        List<BookEntity> bookEntityList= bookRepository.findByBookDetailsPriceLessThan(price);
//        if(bookEntityList != null) {
//            System.out.println("\nFind " + bookEntityList.size() + "book price less than = " + price);
//            for (BookEntity bookEntity: bookEntityList) {
//                System.out.println(bookEntity.toString());
//            }
//        }
//    }
//    public static void findByNameContaining(String name) {
//        List<BookEntity> bookEntityList= bookRepository.findByNameContaining(name);
//        if(bookEntityList != null) {
//            System.out.println("\nFind " + bookEntityList.size() + "book which containing name = " + name);
//            for (BookEntity bookEntity: bookEntityList) {
//                System.out.println(bookEntity.toString());
//            }
//        }
//    }
//    public static void findAllUsingQuery() {
//        List<BookEntity> bookEntityList = bookRepository.getAll();
//        if(bookEntityList != null) {
//            System.out.println("\nFind " + bookEntityList.size() + "books");
//            for (BookEntity bookEntity: bookEntityList) {
//                System.out.println(bookEntity.toString());
//            }
//        }
//    }
//
//    public static void findByBookDetailsIsbn(String isbn) {
//        BookEntity bookEntity = bookRepository.findByBookDetailsIsbn(isbn);
//        if(bookEntity != null) {
//            System.out.println("\nFind book which isbn = " + isbn);
//            System.out.println(bookEntity.toString());
//        }
//    }
//    public static  void createNewBookEntry() {
//        CategoryEntity categoryEntity = new CategoryEntity();
//        categoryEntity.setId(1);
//
//        BookEntity bookEntity = createNewBook();
//        bookEntity.setCategory(categoryEntity);
//        bookRepository.save(bookEntity);
//    }
//    public static void createNewBookEntryWithNewCategory(){
//        CategoryEntity categoryEntity = createNewCatorgy();
//        categoryRepository.save(categoryEntity);
//
//        BookEntity bookEntity = createNewBook();
//        bookEntity.setCategory(categoryEntity);
//        bookRepository.save(bookEntity);
//    }
//    private static CategoryEntity createNewCatorgy() {
//        CategoryEntity categoryEntity = new CategoryEntity();
//        categoryEntity.setName("IT");
//        categoryEntity.setDescription("IT books");
//        return categoryEntity;
//    }
//    private static BookEntity createNewBook() {
//        BookDetailsEntity bookDetailsEntity = new BookDetailsEntity();
//        bookDetailsEntity.setIsbn("ISIBF1219323");
//        bookDetailsEntity.setNumberofPage(23);
//        bookDetailsEntity.setPrice(65);
//        bookDetailsEntity.setPulishDate(LocalDate.now());
//
//        BookEntity bookEntity = new BookEntity();
//        bookEntity.setName("Java A-Z");
//        bookEntity.setAuthor("Roger");
//        bookEntity.setBookDetails(bookDetailsEntity);
//        bookDetailsEntity.setBook(bookEntity);
//
//        return bookEntity;
//    }
}

