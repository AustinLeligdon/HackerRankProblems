import java.util.*;

abstract class Book {
    String title;
    String author;
    
    /**   
    *   Abstract Book Constructor
    *   
    *   @param title The book's title.
    *   @param author The book's author.
    **/
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    // Abstract display method
    abstract void display();
}

class MyBook extends Book{
    // Declare the price instance variable
    private int price;
    
    /**   
    *   Class Constructor
    *   
    *   @param title The book's title.
    *   @param author The book's author.
    *   @param price The book's price.
    **/
    MyBook(String title, String author, int price){
        super(title, author);
        this.price = price;
    }
    
    /**   
    *   Method Name: display
    *   
    *   Print the title, author, and price in the specified format.
    **/
    public void display(){
        System.out.println("Title: " + title + "\nAuthor: " + author + "\nPrice: " + price);
    }
}

public class Day13 {
    public static void main(String[] args) {
        // Scan in the inputs
        Scanner scanner = new Scanner(System.in);

        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        // Create a new book and display its info
        Book book = new MyBook(title, author, price);
        book.display();
    }
}