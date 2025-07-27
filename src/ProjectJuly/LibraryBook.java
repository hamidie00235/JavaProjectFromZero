package ProjectJuly;
public class LibraryBook {
    String title;
    String author;
    boolean isAvailable;

    // Constructor
    public LibraryBook(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true; // default: available
    }

    // Method to display book info
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        if (isAvailable) {
            System.out.println("Status: Available");
        } else {
            System.out.println("Status: Checked out");
        }
        System.out.println();
    }

    // Check out the book
    public void checkOut() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " has been checked out.\n");
        } else {
            System.out.println(title + " is already checked out.\n");
        }
    }

    // Return the book
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println(title + " has been returned.\n");
        } else {
            System.out.println(title + " was not checked out.\n");
        }
    }

    // Main method
    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("Clean Code", "Robert C. Martin");

        book1.displayInfo();        // show initial status
        book1.checkOut();           // check out
        book1.displayInfo();        // show after checkout
        book1.returnBook();         // return the book
        book1.displayInfo();        // show after return
    }
}
