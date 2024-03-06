package Books;

import org.junit.jupiter.api.Test;

import java.util.List;

import static Books.Book.*;
import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void TestAddBook() {
        Book book1 = new Book("Joy of MotherHood", "Ada", "935542");
        Book book2 = new Book("An Introduction to Python", "Guido van", "7893456");
        Book book3 = new Book("An Introduction to Java", "Dietel Dietel", "3456798");
        addBook(book1);
        addBook(book2);
        addBook(book3);
        assertEquals(3, getNumberOfBook());
    }

    @Test
    void testBookRemoval(){
        Book book1 = new Book("Joy of MotherHood", "Ada", "935542");
        Book book2 = new Book("An Introduction to Python", "Guido van", "7893456");
        Book book3 = new Book("An Introduction to Java", "Dietel Dietel", "3456798");
        addBook(book1);
        addBook(book2);
        addBook(book3);
        assertEquals(3, getNumberOfBook());
        removeBook(book1);
        assertEquals(2, getNumberOfBook());

    }

    @Test
    void checkListOfBook(){
        Book book1 = new Book("Joy of MotherHood", "Ada", "935542");
        Book book2 = new Book("An Introduction to Python", "Guido van", "7893456");
        Book book3 = new Book("An Introduction to Java", "Dietel Dietel", "3456798");
        addBook(book1);
        addBook(book2);
        addBook(book3);
        List<Book> bookCollection = Book.getBookList();
        System.out.println("List of books:");
        for (Book book: bookCollection) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + ", ISBN: " + book.getISBN());
        }

    }
}