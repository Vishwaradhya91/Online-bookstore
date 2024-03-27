import java.util.ArrayList;
import java.util.List;

// Book class represents a book with title, author, price, and genre
class Book {
    private String title;
    private String author;
    private double price;
    private String genre;

    public Book(String title, String author, double price, String genre) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.genre = genre;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public String getGenre() {
        return genre;
    }
}

// Bookstore class manages the list of books and provides methods to interact with them
class Bookstore {
    private List<Book> books;

    public Bookstore() {
        this.books = new ArrayList<>();
    }

    // Add a new book to the bookstore
    public void addBook(Book book) {
        books.add(book);
    }

    // Get all books in the bookstore
    public List<Book> getAllBooks() {
        return books;
    }
}

public class OnlineBookstore {
    public static void main(String[] args) {
        // Create a new instance of the bookstore
        Bookstore bookstore = new Bookstore();

        // Add some sample books to the bookstore
        bookstore.addBook(new Book("Java Programming", "John Doe", 29.99, "Programming"));
        bookstore.addBook(new Book("Introduction to Algorithms", "Alice Smith", 39.99, "Computer Science"));
        bookstore.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 9.99, "Fiction"));

        // Get all books from the bookstore
        List<Book> allBooks = bookstore.getAllBooks();

        // Display all books
        System.out.println("Available Books:");
        for (Book book : allBooks) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Price: $" + book.getPrice());
            System.out.println("Genre: " + book.getGenre());
            System.out.println();
        }
    }
}
