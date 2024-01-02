import java.util.ArrayList;
import java.util.Collections;

public class BookSort {
    
    public static void sortByYearOfPublication(ArrayList<Book> bookList) {
        Collections.sort(bookList, (b1, b2) -> b2.getYearOfPublication() - b1.getYearOfPublication());
    }

    public static void sortByAuthor(ArrayList<Book> bookList) {
         Collections.sort(bookList, (b1, b2) -> b2.getAuthor().compareTo(b1.getAuthor()));
    }

    public static void sortByTitle(ArrayList<Book> bookList) {
        Collections.sort(bookList, (b1, b2) -> b1.getTitle().compareTo(b2.getTitle()));
    }
}
