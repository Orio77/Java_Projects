package GPT_Tasks.Task_1_$_LibraryItem;

public class Main {
    public static void main(String[] args) {

        DVD dvd1 = new DVD("Mustang", "Borrowed");
        Book book1 = new Book("White Tooth", "Not borrowed");

        dvd1.checkout();
        System.out.println(dvd1.getStatus());
        System.out.println(dvd1.getTitle());
        dvd1.returnItem();
        System.out.println();
        book1.checkout();
        System.out.println(book1.getStatus());
        System.out.println(book1.getTitle());
        book1.returnItem();
    }
}




/*Task: Create a Simple Library Management System

Define an interface LibraryItem with the following methods:

checkout(): This method will change the status of the item to checked out.
returnItem(): This method will change the status of the item to available.
getStatus(): This method will return the current status of the item.
Create two classes Book and DVD that implement the LibraryItem interface. Each class should have the following properties:

title: The title of the item.
status: The current status of the item (available or checked out).
In the main method, create instances of Book and DVD, and test the methods defined in the LibraryItem interface. */