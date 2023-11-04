package OOP.Ex_5;

import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private static ArrayList<Book> collection;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public static void createCollection(String name) {
        collection = new ArrayList<>();
        System.out.println("New collection created: " + name);
    }

    public void addBook(Book book) {
        if (collection != null) {
            collection.add(book);
            System.out.println("Book added to collection: " + collection);
        }
        else 
            System.out.println("Collection not created yet");
    }
}
