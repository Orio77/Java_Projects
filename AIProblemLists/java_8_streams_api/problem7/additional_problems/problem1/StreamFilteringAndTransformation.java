package java_8_streams_api.problem7.additional_problems.problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Java code

// Problem 10: Stream Filtering and Transformation

public class StreamFilteringAndTransformation {
    // Define a Book class with attributes for the title, author, and a boolean flag for science fiction genre.
    static class Book {
        String title;
        String author;
        boolean isScienceFiction;

        // Constructor
        public Book(String title, String author, boolean isScienceFiction) {
            this.title = title;
            this.author = author;
            this.isScienceFiction = isScienceFiction;
        }

        // Getters
        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public boolean isScienceFiction() {
            return isScienceFiction;
        }
    }

    public static void main(String[] args) {
        // Initialize a list of Book objects with various titles, authors, and genre flags.
        List<Book> books = new ArrayList<>();
        // Add books to the list
        books.add(new Book("Dune", "Frank Herbert", true));
        books.add(new Book("1984", "George Orwell", false));
        books.add(new Book("The Martian", "Andy Weir", true));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", false));
        books.add(new Book("Brave New World", "Aldous Huxley", false));
        books.add(new Book("Foundation", "Isaac Asimov", true));
        // Choose an author.
        String chosenAuthor = "Frank Herbert";
        // Use Java streams to filter the books by the specified author and the science fiction genre.
        List<Book> filteredBooks = books.stream().filter(s -> s.getAuthor().equals(chosenAuthor)).filter(b -> b.isScienceFiction()).collect(Collectors.toList());
        // Transform the stream to a list of book titles and sort them alphabetically.
        List<String> titles = filteredBooks.stream().map(b -> b.getTitle()).collect(Collectors.toList());
        // Print the resulting list of titles to the console.
        System.out.println(titles);
    }   
}
