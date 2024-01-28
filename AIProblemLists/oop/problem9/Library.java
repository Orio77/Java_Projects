package oop.problem9;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> libraryStorage;

    public Library() {
        this.libraryStorage = new ArrayList<>();
    }

    public void addBook(Book book) {
        libraryStorage.add(book);
    }

    public ArrayList<Book> findBooks(Genre genre) {
        
        ArrayList<Book> genreList = new ArrayList<>();

        for (int i = 0; i < libraryStorage.size(); i++) {
            if (libraryStorage.get(i).getGenre() == genre)
                genreList.add(libraryStorage.get(i));
        }

        return genreList;
    }

    public void printBookDetails(ArrayList<Book> bookList) {
        
        for (Book book : bookList)
            book.printDetails();
    }
    
}
