package ProjectJuly;

public class Movie {
    String title;
    String genre;
    int rating;
    boolean watch;

    // Constructor
    public Movie(String title, String genre, int rating, boolean watch) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.watch = watch; // Use the passed parameter
    }

    // Method to display movie info
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating);
        System.out.println("Status: " + (watch ? "Watched" : "Not watched"));
    }

    // Method to mark movie as watched
    public void markAsWatched() {
        watch = true;
    }

    // Main method
    public static void main(String[] args) {
        Movie m = new Movie("Inception", "Sci-Fi", 9, false);
        m.displayInfo();             // Show movie info before watching
        m.markAsWatched();           // Mark as watched
        System.out.println("After watching:");
        m.displayInfo();             // Show updated info
    }
}
