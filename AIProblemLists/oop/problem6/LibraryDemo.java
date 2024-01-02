package oop.problem6;

import java.util.ArrayList;

public class LibraryDemo {
    public static void main(String[] args) {
        
        ArrayList<Book> books = new ArrayList<>();
        Library library1 = new Library();
        
        Book book1 = new Book("Pride and Prejudice", "Jane Austin");
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book3 = new Book("Wuthering Heights", "Emily Bronte");
        Book book4 = new Book("Anna Karenina", "Leo Tolstoy");
        Book book5 = new Book("Madame Bovary", "Gustave Flaubert");

        library1.addBook(book1);

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        books.remove(book5);

        System.out.println(library1.findBook("The Great Gatsby"));
    }
}
