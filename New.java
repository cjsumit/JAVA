
import java.util.Scanner;

class Book {
    String title;
    String author;
    String genre;
    int year;
    
    Book(String title, String author, String genre, int year) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.year = year;
    }
    
    void displayBook() {
        System.out.println("\nBook Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        System.out.println("Year: " + year);
    }
}

public class New {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Book Details");
        System.out.print("Enter Title: ");
        String title = scanner.nextLine();
        
        System.out.print("Enter Author: ");
        String author = scanner.nextLine();
        
        System.out.print("Enter Genre: ");
        String genre = scanner.nextLine();
        
        System.out.print("Enter Year: ");
        int year = scanner.nextInt();
        
        Book book = new Book(title, author, genre, year);
        book.displayBook();
        
        scanner.close();
    }
}
