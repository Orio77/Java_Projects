package java_8_streams_api.problem5;

import java.util.Random;
import java.util.stream.IntStream;

public class Problem5StreamFromRandomNumbers {
    public static void main(String[] args) {
        // Initialize a stream to hold the random numbers
        Random random = new Random();

        IntStream numberStream = random.ints(100, 0, 100);
        // Generate 100 random numbers and add them to the stream

        // Calculate the average of the numbers in the stream
        numberStream.average()
                    .ifPresent(avg -> System.out.println("The average is " + avg));
    }
}


/*Student Attempt Review: The student's attempt at creating a stream of random numbers and calculating their average reveals a fundamental misunderstanding of Java Streams and their operations. 
The unnecessary use of ArrayList and Stream.concat indicates a lack of clarity in stream creation and manipulation.

Key Learning Points for the Student:

Stream Creation: The student needs to understand the direct creation of streams, especially using methods like Random.ints() for generating random numbers.
Stream Operations: The use of map() was misplaced. The student should be guided on different stream operations, particularly average(), which is more relevant here.
Simplifying Code: The attempt shows a tendency to overcomplicate solutions. Teaching simpler and more direct methods to achieve a task would be beneficial.
Recommendations:

A detailed walkthrough of Stream API methods, with emphasis on direct stream generation.
Clear examples differentiating between transformation (map) and aggregation (average) operations in streams.
Encourage practice in writing more streamlined and efficient code.
The student is creative in their approach but needs guidance in applying Java Stream operations more appropriately and effectively. */