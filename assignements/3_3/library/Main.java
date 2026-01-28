package library;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Library System ===\n");
        
        // Create instances of Library, Book, LibraryMember
        library.system.Library lib = new library.system.Library();
        
        // Create members
        library.model.LibraryMember member1 = new library.model.LibraryMember("Jarkko", 1);
        library.model.LibraryMember member2 = new library.model.LibraryMember("Anna", 2);
        
        // Create books
        library.model.Book book1 = new library.model.Book("Ohtu", "Arto", "12345");
        library.model.Book book2 = new library.model.Book("Clean Code", "Robert Martin", "67890");
        library.model.Book book3 = new library.model.Book("Design Patterns", "Gang of Four", "11111");
        
        // Add members to library
        lib.addMember(member1);
        lib.addMember(member2);
        
        // Add books to library
        lib.addBook(book1);
        lib.addBook(book2);
        lib.addBook(book3);
        
        System.out.println("--- Borrowing Operations ---");
        // Member 1 borrows a book
        lib.borrowBook(member1, book1);
        System.out.println("Jarkko borrowed: " + book1.getTitle());
        
        System.out.println("\n--- Reservation Operations ---");
        // Member 2 reserves book 1 (which is currently borrowed)
        lib.reserveBook(member2, book1);
        
        // Member 1 tries to reserve book 1 (already reserved by member 2)
        lib.reserveBook(member1, book1);
        
        // Member 1 reserves book 2
        lib.reserveBook(member1, book2);
        
        // Member 2 reserves book 3
        lib.reserveBook(member2, book3);
        
        System.out.println("\n--- Display Reserved Books ---");
        // Display reserved books for both members
        lib.displayReservedBooks(member1);
        System.out.println();
        lib.displayReservedBooks(member2);
        
        System.out.println("\n--- Cancel Reservation ---");
        // Member 1 cancels reservation for book 2
        lib.cancelReservation(member1, book2);
        
        // Try to cancel a reservation that doesn't belong to member 1
        lib.cancelReservation(member1, book3);
        
        System.out.println("\n--- Final Reserved Books ---");
        // Display final state of reserved books
        lib.displayReservedBooks(member1);
        System.out.println();
        lib.displayReservedBooks(member2);
    }
}