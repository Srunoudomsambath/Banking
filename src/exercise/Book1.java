package exercise;

import lombok.Getter;
import lombok.Setter;

public class Book1 {
    @Setter
    @Getter
    private int id;
    @Setter
    @Getter
    private String title;
    @Setter
    @Getter
    private String author;
    private boolean isAvailable;

    public Book1(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void getDetails() {
        System.out.println(id + " - " + title + " by " + author + " (" +
                (isAvailable ? "Available" : "Not Available") + ")");
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed: " + title);
        } else {
            System.out.println("Sorry, " + title + " is not available.");
        }
    }

    // Return the book
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Book returned: " + title);
        } else {
            System.out.println(title + " is already available.");
        }
    }
}
