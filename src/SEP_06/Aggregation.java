package SEP_06;


//aggregation
//= Represents a "has-a" relationship between objects.
//One object contains another object as part of its structure,
//but the contained object/s can exist independently.

class Library{

    String name;
    int year;
    Book[] books;

    public Library(String name, int year, Book[] books) {
        this.name = name;
        this.year = year;
        this.books = books;
    }

    void displayInfo(){
        System.out.println("The " + year +" "+name+" ");
        System.out.println("Books available");
        for(Book book : books){
            System.out.println(book.displayInfo());
        }
    }
}

class Book{
    String title;
    int pages;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    String displayInfo(){
        return this.title + " (" + pages + ") ";
    }
}

public class Aggregation {
    public static void main(String[] args) {

        Book book1 = new Book("C++",122);
        Book book2 = new Book("Python",123);
        Book book3 = new Book("Java", 124);

        Book[] books = {book1, book2, book3};

        System.out.println(book1.displayInfo());
        System.out.println(book2.displayInfo());
        System.out.println(book3.displayInfo());

        for(Book book : books){
            System.out.println("<-------------->");
            System.out.println(book.displayInfo());
        }

        //This is aggregation
        Library library = new Library("JAIN Uni LIBRARY", 2025,books);
        library.displayInfo();

    }
}
