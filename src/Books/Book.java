package Books;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private static final List<Book> bookList = new ArrayList<>();
    private static int numberOfBook;


    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public static List<Book> getBookList() {
        return bookList;
    }

    public static void addBook(Book book){
        bookList.add(book);
        numberOfBook++;

    }

    public static void removeBook(Book book){
        bookList.remove(book);
        numberOfBook--;
    }

    public static int getNumberOfBook() {
        return numberOfBook;
    }
}
