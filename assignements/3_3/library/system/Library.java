package library.system;

import java.util.ArrayList;
import java.util.List;

import library.model.Book;
import library.model.LibraryMember;

public class Library {
    private List<Book> books;
    private List<LibraryMember> members;

    // Constructor to initialize the lists
    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        // Add book to the library
        books.add(book);
    }

    public void addMember(LibraryMember member) {
        // Add member to the library
        members.add(member);
    }

    public void borrowBook(LibraryMember member, Book book) {
        // Borrow book from the library
        member.borrowBook(book);
    }

    public void returnBook(LibraryMember member, Book book) {
        // Return book to the library
        member.returnBook(book);
    }

    public void reserveBook(LibraryMember member, Book book) {
        // Reserve book for the member
        if (!book.isReserved()) {
            book.setReserved(true);
            book.setReservedBy(member);
            member.reserveBook(book);
            System.out.println("Book '" + book.getTitle() + "' has been reserved by " + member.getName());
        } else {
            System.out.println("Book '" + book.getTitle() + "' is already reserved by " + book.getReservedBy().getName());
        }
    }

    public void cancelReservation(LibraryMember member, Book book) {
        // Cancel reservation of the book
        if (book.isReserved() && book.getReservedBy() == member) {
            book.setReserved(false);
            book.setReservedBy(null);
            member.cancelReservation(book);
            System.out.println("Reservation for '" + book.getTitle() + "' has been cancelled.");
        } else if (!book.isReserved()) {
            System.out.println("Book '" + book.getTitle() + "' is not reserved.");
        } else {
            System.out.println("You did not reserve this book.");
        }
    }

    public void displayReservedBooks(LibraryMember member) {
        // Display reserved books for a member
        List<Book> reservedBooks = member.getReservedBooks();
        if (reservedBooks.isEmpty()) {
            System.out.println(member.getName() + " has no reserved books.");
        } else {
            System.out.println(member.getName() + "'s reserved books:");
            for (Book book : reservedBooks) {
                System.out.println("  - " + book.getTitle() + " by " + book.getAuthor());
            }
        }
    }
}