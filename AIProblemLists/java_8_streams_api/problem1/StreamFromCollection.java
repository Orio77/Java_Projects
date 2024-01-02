package java_8_streams_api.problem1;

import java.util.Arrays;
import java.util.List;

public class StreamFromCollection {
    public static void main(String[] args) {
        // Initialize the list of student names
        List<String> studentNames = Arrays.asList("John", "Jane", "Tom", "Emily", "Alex");

        // TODO: Create a stream from this list and print each name on the console

        studentNames.stream()
                    .forEach(System.out::println);
    }
}
