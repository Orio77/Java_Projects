package oop.problem6;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

     void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public String findBook(String title) {
        
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equals(title))
                return books.get(i).getTitle();
        }

        return null;
    }

    public ArrayList<Book> getBookList() {
        return books;
    }
}
