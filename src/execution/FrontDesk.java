/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import java.util.Scanner;

public class FrontDesk {
    public static final int NEW_BOOK = 1;
    public static final int PREVIOUSLY_ISSUED_BOOK = 2;
    public static final int ALL_ISSUED_BOOKS = 3;
    public static final int EXIT = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        do {
            System.out.println("_=_=__=_=_" + "Welcome To The Front Desk" + "_=_=__=_=_");
            System.out.println("How may I Help you today?");
            System.out.println("1. Issues a new book for me.");
            System.out.println("2. Return a previously issues book for me.");
            System.out.println("3. Show me all my issues books.");
            System.out.println("4. Exit.");


        }
}
