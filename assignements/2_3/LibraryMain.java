public class LibraryMain {
    public static void main(String[] args) {

        // Create Books
        Book book1 = new Book("Introduction to Java Programming", "John Smith", 2020);
        Book book2 = new Book("Data Structures and Algorithms", "Jane Doe", 2018);
        Book book3 = new Book("The Art of Fiction", "Alice Johnson", 2019);

        book1.setRating(4.5);
        book2.setRating(4.8);
        book3.setRating(4.2);

        book2.addReview("Excellent explanation of algorithms.");
        book2.addReview("Very helpful for exams.");

        // Create Library
        Library library = new Library();

        // Add Books
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Display all books
        library.displayBooks();

        // Search by author
        library.findBooksByAuthor("Jane Doe");

        // User system
        User user1 = new User("Alice", 21);
        library.addUser(user1);

        // Borrow a book
        Book borrowed = library.borrowBook("Data Structures and Algorithms");
        if (borrowed != null) {
            user1.borrowBook(borrowed);
            System.out.println("\nBook borrowed successfully.");
        }

        // Availability check
        System.out.println("Is 'Data Structures and Algorithms' available? " +
                library.isBookAvailable("Data Structures and Algorithms"));

        // Return book
        user1.returnBook(borrowed);
        library.returnBook(borrowed);

        // Statistics
        System.out.println("\nAverage Book Rating: " + library.getAverageBookRating());
        Book mostReviewed = library.getMostReviewedBook();
        if (mostReviewed != null) {
            System.out.println("Most Reviewed Book: " + mostReviewed.getTitle());
        }
    }
}
