import java.util.*;

class Book {
    int id;
    String title;
    String author;

    // Constructor
    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    // Display method
    void display() {
        System.out.println("ID: " + id + " | Title: " + title + " | Author: " + author);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Create array of Book objects
        Book[] books = new Book[n];

        // Take book details from user
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Book " + (i + 1) + ":");
            System.out.print("Enter Book ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Enter Book Title: ");
            String title = sc.nextLine();
            System.out.print("Enter Author Name: ");
            String author = sc.nextLine();

            books[i] = new Book(id, title, author);
        }

        // Search by book title
        System.out.print("\nEnter title to search: ");
        String searchTitle = sc.nextLine();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (books[i].title.equalsIgnoreCase(searchTitle)) {
                System.out.println("\nBook Found:");
                books[i].display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nBook not found!");
        }

        sc.close();
    }
}
