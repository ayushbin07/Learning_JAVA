package SEP_05;

import java.util.ArrayList;
import java.util.Scanner;

// Handles book management
class LibraryManager {
    private ArrayList<String> availableBooks = new ArrayList<>();
    private ArrayList<String> issuedBooks = new ArrayList<>();

    // Constructor with mock data
    public LibraryManager() {
        addBook("The Alchemist");
        addBook("1984");
        addBook("Clean Code");
        addBook("Harry Potter and the Sorcerer's Stone");
        addBook("The Lord of the Rings");
        addBook("To Kill a Mockingbird");
        addBook("The Pragmatic Programmer");
        addBook("Brave New World");
        addBook("Think and Grow Rich");
        addBook("The Great Gatsby");
    }

    public void addBook(String bookName) {
        availableBooks.add(bookName);
    }

    public void issueBook(String bookName) {
        if (availableBooks.remove(bookName)) {
            issuedBooks.add(bookName);
            System.out.println(bookName + " has been issued.");
        } else {
            System.out.println("The book " + bookName + " is unavailable or already issued.");
        }
    }

    public void returnBook(String bookName) {
        if (issuedBooks.remove(bookName)) {
            availableBooks.add(bookName);
            System.out.println("The book " + bookName + " has been returned.");
        } else {
            System.out.println("This book was not issued from our library.");
        }
    }

    public void showAvailableBooks() {
        if (availableBooks.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println("Available Books:");
            for (int i = 0; i < availableBooks.size(); i++) {
                System.out.println((i + 1) + ". " + availableBooks.get(i));
            }
        }
    }

    public void showIssuedBooks() {
        if (issuedBooks.isEmpty()) {
            System.out.println("No books issued yet.");
        } else {
            System.out.println("Issued Books:");
            for (int i = 0; i < issuedBooks.size(); i++) {
                System.out.println((i + 1) + ". " + issuedBooks.get(i));
            }
        }
    }
}

// Handles the UI/Menu
public class Library_ChatGPT {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();
        boolean running = true;

        while (running) {
            showMenu();
            int choice = getChoice();

            switch (choice) {
                case 1 -> manager.showAvailableBooks();
                case 2 -> manager.showIssuedBooks();
                case 3 -> {
                    System.out.print("Enter book name: ");
                    String newBook = sc.nextLine();
                    manager.addBook(newBook);
                }
                case 4 -> {
                    System.out.print("Enter book to issue: ");
                    String issueBook = sc.nextLine();
                    manager.issueBook(issueBook);
                }
                case 5 -> {
                    System.out.print("Enter book to return: ");
                    String returnBook = sc.nextLine();
                    manager.returnBook(returnBook);
                }
                case 6 -> {
                    System.out.println("Thanks for using our library!");
                    running = false;
                }
                default -> System.out.println("Invalid choice! Try again.");
            }
        }
    }

    private static void showMenu() {
        System.out.println("\n-----------------------------------");
        System.out.println("1. Check available books");
        System.out.println("2. Check issued books");
        System.out.println("3. Add a new book");
        System.out.println("4. Issue a book");
        System.out.println("5. Return a book");
        System.out.println("6. Exit");
        System.out.println("-----------------------------------");
        System.out.print("Enter your choice: ");
    }

    private static int getChoice() {
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input! Enter a number.");
            sc.nextLine();
        }
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline
        return choice;
    }
}
