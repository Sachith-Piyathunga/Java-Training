public class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public static void main(String[] args) {

        Book book1 = new Book();
        System.out.println("Book title: " + book1.title);
        System.out.println("Book author: " + book1.author);
        System.out.println("Book price: " + book1.price);

        Book book2 = new Book("The wall", "Sachintha");
        System.out.println("Book title: " + book2.title);
        System.out.println("Book author: " + book2.author);
        System.out.println("Book price: " + book2.price);

        Book book3 = new Book("The New Life", "Piyathunga", 250.56);
    }
}
