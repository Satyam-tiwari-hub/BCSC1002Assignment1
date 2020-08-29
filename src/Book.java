public class Book {
    private String bookName;
    private String authorName;
    private long ISBN_NUMBER;

    public Book() {
        bookName = null;
        authorName = null;
        ISBN_NUMBER = 0;
    }

    public Book(String bookName, String authorName, long ISBN_NUMBER) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.ISBN_NUMBER = ISBN_NUMBER;
    }
}
