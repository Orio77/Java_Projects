package oop.problem9;

import java.util.ArrayList;

public class LibrarySystemDemo {
    public static void main(String[] args) {

        // Generating additional objects
        Book book1 = new Book("Game of Thrones", "George R.R. Martin", Genre.FICTION);
        Book book2 = new Book("Harry Potter", "J.K. Rowling", Genre.FICTION);
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", Genre.CLASSIC);
        Book book4 = new Book("The Great Gatsby", "F. Scott Fitzgerald", Genre.CLASSIC);
        Book book5 = new Book("1984", "George Orwell", Genre.FICTION);
        Book book6 = new Book("Pride and Prejudice", "Jane Austen", Genre.NONFICTION);

        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);

        ArrayList<Book> fictionBooks = library.findBooks(Genre.FICTION);

        library.printBookDetails(fictionBooks);
    }
}
