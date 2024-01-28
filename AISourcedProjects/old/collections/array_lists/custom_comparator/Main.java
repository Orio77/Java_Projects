import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Eden1", "Rick Robin1", 1995);
        Book book2 = new Book("Eden2", "Rick Robin2", 1996);
        Book book3 = new Book("Eden3", "Rick Robin3", 1997);
        Book book4 = new Book("Eden4", "Rick Robin4", 1900);
        Book book5 = new Book("Eden5", "Rick Robin5", 1999);
        Book book6 = new Book("Eden6", "Rick Robin6", 2000);
        Book book7 = new Book("Eden7", "Rick Robin7", 2001);

        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        bookList.add(book6);
        bookList.add(book7);
        BookSort.sortByYearOfPublication(bookList);
        System.out.println(bookList);
        BookSort.sortByTitle(bookList);
        System.out.println(bookList);
    }
}
