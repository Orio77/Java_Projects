package OOP.Ex_5;

public class Main {
    public static void main(String[] args) {
        Book.createCollection("Fantasy");

        Book tale = new Book("lol", "no", "woef");

        tale.addBook(tale);
    }
}


/*5. Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, 
and methods to add and remove books from a collection. */