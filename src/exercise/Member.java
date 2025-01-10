package exercise;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Member {
    @Setter
    private int id;
    @Setter
    private String name;
    private final List<Book1> borrowedBooks;

    // Constructor
    public Member(int id, String name) {
        this.id = id;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    // Method to borrow a book
    public void borrowBook(Book1 book) {
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.borrowBook();
        } else {
            System.out.println(name + " cannot borrow " + book.getTitle() + " as it is not available.");
        }
    }

    // Method to return a book
    public void returnBook(Book1 book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.returnBook();
        } else {
            System.out.println(name + " hasn't borrowed " + book.getTitle() + ".");
        }
    }

    // Method to display member details
    public void getDetails() {
        System.out.print(id + " - " + name + " (");
        if (borrowedBooks.isEmpty()) {
            System.out.println("No books borrowed)");
        } else {
            System.out.print("Books borrowed: ");
            for (Book1 book : borrowedBooks) {
                System.out.print(book.getTitle() + " ");
            }
            System.out.println(")");
        }
    }
}
