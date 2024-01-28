package java_8_streams_api.problem15;

// Java code

// Problem 15: Stream Concatenation

import java.util.stream.Stream;

public class StreamConcatenation {
    public static void main(String[] args) {
        // Initialize two Stream<String> objects representing lines from two different text files.
        Stream<String> file1Lines = Stream.of("Java is a programming language", "Python is also a language", "Java supports OOP");
        Stream<String> file2Lines = Stream.of("Java has a rich API", "JavaScript is different from Java", "C++ is another language");

        // Count the total number of such lines.
        Stream<String> concatedSTream = Stream.concat(file1Lines, file2Lines);
        long javaCount = concatedSTream.filter(s -> s.toLowerCase().contains("java")).count();
        // Print the count to the console.
        System.out.println(javaCount);
    }
}
