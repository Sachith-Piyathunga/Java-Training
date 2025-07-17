// Create a class Book with two constructors — one with title only, another with title and author.

class Book {
    String title;
    String author;

    Book(String t) {
        title = t;
        author = "Unknown";
    }

    Book(String t, String a) {
        title = t;
        author = a;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Basics");
        Book b2 = new Book("Advanced Java", "John");

        b1.display();
        b2.display();
    }
}
