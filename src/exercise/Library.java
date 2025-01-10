package exercise;

import java.util.ArrayList;
import java.util.List;
public class Library {
    private List<Book1> books;
    private List<Member> members;

    // Constructor
    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    // Methods
    public void addBook(Book1 book) {
        books.add(book);
    }

    public void registerMember(Member member) {
        members.add(member);
    }

    public void displayBooks() {
        System.out.println("\nDisplaying All Books:");
        for (Book1 book : books) {
            book.getDetails();
        }
    }

    public void displayMembers() {
        System.out.println("\nDisplaying All Members:");
        for (Member member : members) {
            member.getDetails();
        }
    }

    public Book1 findBookById(int id) {
        for (Book1 book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    public Member findMemberById(int id) {
        for (Member member : members) {
            if (member.getId() == id) {
                return member;
            }
        }
        return null;
    }
}