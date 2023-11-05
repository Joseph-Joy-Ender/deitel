package beginWithJavaExercises.StaticExamples;

public class Book {
    private final String title;
    private final String author;
    private final double price;

    public Book(String title, Author author, double price) {
        this.title = title;
        this.author = String.valueOf(author);
        this.price = price;
    }

    public String toString() {
        return "Title: " + title + "\nAuthor: " + author + "\nPrice: " + price;
    }
}
