import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    // Task 1: Basic Library Methods
    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("\nLibrary Catalog:");
        int count = 1;
        for (Book book : books) {
            System.out.print(count++ + ". ");
            book.displayBookDetails();
        }
    }

    public void findBooksByAuthor(String author) {
        System.out.println("\nBooks by Author \"" + author + "\":");
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println("Title: \"" + book.getTitle() +
                        "\", Year: " + book.getPublicationYear());
            }
        }
    }

    // Task 2: Borrowing System
    public Book borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                books.remove(book);
                return book;
            }
        }
        return null;
    }

    public void returnBook(Book book) {
        books.add(book);
    }

    // Task 3: Availability Check
    public boolean isBookAvailable(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return true;
            }
        }
        return false;
    }

    // Task 5: Library Statistics
    public double getAverageBookRating() {
        if (books.isEmpty()) return 0.0;

        double total = 0;
        for (Book book : books) {
            total += book.getRating();
        }
        return total / books.size();
    }

    public Book getMostReviewedBook() {
        if (books.isEmpty()) return null;

        Book mostReviewed = books.get(0);
        for (Book book : books) {
            if (book.getReviewCount() > mostReviewed.getReviewCount()) {
                mostReviewed = book;
            }
        }
        return mostReviewed;
    }

    // Task 6: Users
    public void addUser(User user) {
        users.add(user);
    }
}
