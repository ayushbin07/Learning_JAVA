package SEP_05;
//Sunday ho ya Monday, Roj khao andey
//GitHub

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

//https://youtu.be/iOaDMWkmc3Q?si=-memiT8SarFBjs-3
//Solve this
//You have to implement a library using Java class Library
//Methods: addBook, issueBook, returnBook, showAvailableBooks
//Properties: Array to store the available books.
//Array to store the issued books
class libraryClass{
    ArrayList<String> availableBooks = new ArrayList<>();
    ArrayList<String> issuedBooks = new ArrayList<>();

    public void setAvailableBook(String bookName){
        availableBooks.add(bookName);
    }

    public void issueBooks(String bookName){
        if(availableBooks.contains(bookName)){
            availableBooks.remove(bookName);
            issuedBooks.add(bookName);
            System.out.println(bookName +" found. It is issued to your name.");
        }else {
            System.out.println("The book "+ bookName + "either is unavailable or is already issued.");

        }
    }

    public void returnBook(String bookName){
        if(issuedBooks.contains(bookName)){
            issuedBooks.remove(bookName);
            availableBooks.add(bookName);
            System.out.println("The book "+bookName+" has been returned successfully.");
        }else {
            System.out.println("Book you are trying to return doesn't appears to be issued by us.");
        }
    }

    public void showAvailableBooks(){
        for(int i = 0;i<availableBooks.size(); i++){
            System.out.println(i+1+". "+availableBooks.get(i) );
        }
    }
    public void showIssuedBooks(){
        for(int i = 0;i<issuedBooks.size(); i++){
            System.out.println(i+1+". "+issuedBooks.get(i) );
        }
    }
}

public class Library {
    public static void main(String[] args) {
        boolean state = true;
        Scanner sc = new Scanner(System.in);
        libraryClass manager = new libraryClass();

        //Mock data just for testing
        manager.setAvailableBook("The Alchemist");
        manager.setAvailableBook("1984");
        manager.setAvailableBook("Clean Code");
        manager.setAvailableBook("Harry Potter and the Sorcerer's Stone");
        manager.setAvailableBook("The Lord of the Rings");
        manager.setAvailableBook("To Kill a Mockingbird");
        manager.setAvailableBook("The Pragmatic Programmer");
        manager.setAvailableBook("Brave New World");
        manager.setAvailableBook("Think and Grow Rich");
        manager.setAvailableBook("The Great Gatsby");
        //Can comment it out it will still run.1



        while(state){
            System.out.println("-----------------------------------");
            System.out.println("1. Check available books.");
            System.out.println("2. Check Issued books");
            System.out.println("3. Add new books to available books");
            System.out.println("4. Issue books from library.");
            System.out.println("5. Return books");
            System.out.println("6. Exit");
            System.out.println("-----------------------------------");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    System.out.println("The available books are as follows ");
                    manager.showAvailableBooks();
                    break;
                case 2:
                    System.out.println("The list of issued books are: ");
                    manager.showIssuedBooks();
                    break;
                case 3:
                    System.out.println("Name the book;");
                    String newBook = sc.nextLine();
                    manager.setAvailableBook(newBook);
                    break;
                case 4:
                    System.out.println("Name the book you want: ");
                    newBook = sc.nextLine();
                    manager.issueBooks(newBook);
                    break;
                case 5:
                    System.out.println("Name the book you want to be returned. \n P.S. It must be issued to your name.");
                    newBook = sc.nextLine();
                    manager.returnBook(newBook);
                    break;
                case 6:
                    System.out.println("Thanks for using our services. \n Please leave a rating.");
                    state = false;
                    break;
                default:
                    System.out.println("Common sense isn't common");
                    break;
            }
        }
    }
}
