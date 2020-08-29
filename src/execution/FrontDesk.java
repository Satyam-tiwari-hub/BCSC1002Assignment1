/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Book;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    public static final int NEW_BOOK = 1;
    public static final int PREVIOUSLY_ISSUED_BOOK = 2;
    public static final int ALL_ISSUED_BOOKS = 3;
    public static final int EXIT = 4;

    public static void main(String[] args) {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        int userInput;
        Book book = new Book();
        String bookName;
        String previouslyIssuedBook;

        do {
            System.out.println("_=_=__=_=_" + "Welcome To The Front Desk" + "_=_=__=_=_");
            System.out.println("How may I Help you today?");
            System.out.println("1. Issues a new book for me.");
            System.out.println("2. Return a previously issues book for me.");
            System.out.println("3. Show me all my issues books.");
            System.out.println("4. Exit.");
            System.out.println("Enter your choice (1...4):");
            userInput = scanner.nextInt();
            switch (userInput) {
                case NEW_BOOK -> {
                    System.out.println("Enter the name of book you want to issue:");
                    scanner.nextLine();
                    bookName = scanner.nextLine();
                    book.newBook(bookName);
                }
                case PREVIOUSLY_ISSUED_BOOK -> {
                    System.out.println("Enter the name of book you want to return:");
                    scanner.nextLine();
                    previouslyIssuedBook = scanner.nextLine();
                    book.doReturn(previouslyIssuedBook);
                }
                case ALL_ISSUED_BOOKS -> student.numberOfBooksIssued();
                case EXIT -> System.out.println("Thank You");
                default -> System.out.println("Enter right choice:");
            }
        } while (userInput != EXIT);
        scanner.close();
    }
}
