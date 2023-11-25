package chapter8;

public class BookTest {
    public static void main(String[] args) {
        System.out.printf("%-12s%-12s%-45s%s%n", "Book", "Owner", "Title", "Copyright year");
        System.out.println();
        for (Book book: Book.values()) {
            System.out.printf("%-12s%-12s%-45s%s%n", book, book.getOwner(), book.returnTitle(), book.returnCopyrightYear());

        }
    }
}
