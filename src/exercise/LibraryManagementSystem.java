package exercise;
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        System.out.println("Welcome to the exercise.Library Management System!");

        // Add Books to the exercise.Library
        System.out.println("Adding Books...");
        Book1 book1 = new Book1(1, "Harry potter", "J.K Rowling");
        Book1 book2 = new Book1(2, "Doctor Strange", "Stan Lee");
            library.addBook(book1);
            library.addBook(book2);

        // Add Members to the exercise.Library
        System.out.println("Adding Members...");
        Member member1 = new Member(1, "Tommy");
        Member member2 = new Member(2, "Jerry");
            library.registerMember(member1);
            library.registerMember(member2);

        // Display All Books and Members
         library.displayBooks();
         library.displayMembers();

        System.out.println("\nTommy borrows \"Harry potter\"");
        member2.borrowBook(book1);

        // Display All Books and Members
            library.displayBooks();
            library.displayMembers();

        // Bob returns "Harry potter"
        System.out.println("\nTommy returns \"Harry potter\"...");
        member2.returnBook(book1);

        // Display All Books and Members
            library.displayBooks();
            library.displayMembers();

        // Find Book by ID
        System.out.println("Searching for book with ID 1...");
        Book1 foundBook = library.findBookById(1);
        if (foundBook != null) {
            System.out.println("Found: " + foundBook.getTitle());
        } else {
            System.out.println("Book with ID 1 not found.");
        }

        // Find Member by ID
        System.out.println("Searching for member with ID 2...");
        Member foundMember = library.findMemberById(2);
        if (foundMember != null) {
            System.out.println("Found: " + foundMember.getName());
        } else {
            System.out.println("Member with ID 2 not found.");
        }
    }
}




