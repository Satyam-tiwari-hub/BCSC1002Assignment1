package definitions;

import java.util.Objects;

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

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public long getISBN_NUMBER() {
        return ISBN_NUMBER;
    }

    public void setISBN_NUMBER(long ISBN_NUMBER) {
        this.ISBN_NUMBER = ISBN_NUMBER;
    }

    /**
     * This method allow us to issue a book.
     *
     * @param bookName The name of the book we want to issue.
     */
    public void newBook(String bookName) {
        System.out.println("Thank you for issuing \"" + bookName + "\".");
    }

    /**
     * This method allow us to return a previously issued book.
     *
     * @param previouslyIssuedBook The name of the books issued previously.
     */
    public void doReturn(String previouslyIssuedBook) {
        System.out.println("Thank you for returning\"" + previouslyIssuedBook + "\".");
    }


    @Override
    public String toString() {
        return "\ndefinitions.Book Name" + bookName + "\nAuthor Name" + authorName
                + "\nISBN Number" + ISBN_NUMBER;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return ISBN_NUMBER == book.ISBN_NUMBER &&
                Objects.equals(bookName, book.bookName) &&
                Objects.equals(authorName, book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, authorName, ISBN_NUMBER);
    }
}
