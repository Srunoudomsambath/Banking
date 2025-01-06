interface Reservable {
    void reserveItem();
    void cancelREservation();
}


class LibraryItem{
    String itemId;
    String title;
    boolean isAvailable ;

    public LibraryItem(){
        this.itemId=itemId;
        this.title=title;
        this.isAvailable=isAvailable;
    }
   public void borrowItem(){
//        if(!isAvailable){
//            isAvailable = true;
//            System.out.println(title + "has been borrowed .");
//        }else{
//            System.out.println(title + "is already borrowed");
//        }
    }
    public void returnItem(){}
    void displayDetails(){
        System.out.println("ItemId" + itemId);
        System.out.println("title" + title);
        System.out.println("Available" + isAvailable);
    }

    public void addItem(Magazine book) {
    }
    public void addItem(Book book){}
}
class Book extends LibraryItem {
    private String author;
    private String genre;
    public Book(String itemId, String title,String author,String genre) {
        super();
        this.author=author;
        this.genre = genre;
    }

    //    boolean isAvailable = false;
    @Override
    public void borrowItem() {
        if (!isAvailable) {
            isAvailable = false;
            System.out.println(title + "has been borrowed");
        } else {
            System.out.println(title + "is already borrowed");
        }
    }

    @Override
    public void returnItem() {
        if (isAvailable) {
            isAvailable = true;
            System.out.println(title + "has been returned");
        } else {
            System.out.println(title + "was not borrowed");
        }
    }
    public void displaydetail(){
        System.out.println("Author : " + author);
        System.out.println("Genre : " + genre);
    }

}

class Magazine extends LibraryItem implements Reservable{
    int issueNumber;
    String publicationDate;

    public Magazine(String itemId, String title,int issueNumber ,String publicationDate) {
        super();
        this.issueNumber = issueNumber;
        this.publicationDate = publicationDate;
    }

    @Override
    public void borrowItem() {
        if(!isAvailable){
            isAvailable = false;
            System.out.println(title + "has been borrowed");
        } else {
            System.out.println(title + "is already borrowed");
        }
    }

    @Override
    public void returnItem() {
        if (isAvailable) {
            isAvailable = true;
            System.out.println(title + "has been returned");
        } else {
            System.out.println(title + "was not borrowed");
        }
    }

    @Override
    public void reserveItem() {
        System.out.println("Book reserved : " + title);
    }

    @Override
    public void cancelREservation() {
        System.out.println("Book reservation cancelled" + title);
    }
    public void displayDetail(){
        System.out.println("issurNumber : " + issueNumber);
        System.out.println("PublicationNumber : " + publicationDate);
    }
}



public class Library_Management_System {
    public static void main(String[] args) {
        LibraryItem libraryItem = new LibraryItem();
        libraryItem.addItem(new Book("M02", "Java", "Teacher", "Student"));
        libraryItem.addItem(new Book("M03", "python", "Teacher2", "Student2"));
        libraryItem.addItem(new Magazine("S03","C++",3,"22,03,2024"));
    }
}