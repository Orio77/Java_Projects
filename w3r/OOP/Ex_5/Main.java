package OOP.Ex_5;

public class Main {
    public static void main(String[] args) {

        Book tale = new Book("Narnia", "Saint Laurent", "36733");
        Book book2 = new Book("Detective", "Stephen King", "26531");
        Book book3 = new Book("Turtle King", "Luther Black", "43575");

        BookCollection collection = new BookCollection();

        collection.addBook(collection.getCollection("fantasyCollection"), tale);
        collection.addBook(collection.getCollection("dramaCollection"), book2);
        collection.addBook(collection.getCollection("dramaCollection"), book3);

        collection.printAll();

        collection.removeBook(collection.getCollection("dramaCollection"), book2);

        collection.printAll();

    }
}


/*5. Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, 
and methods to add and remove books from a collection. */