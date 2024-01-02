package java_8_streams_api.problem3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class StreamFromFile {
    public static void main(String[] args) {
        // Initialize the path to the text file
        String filePath = "C:\\Users\\macie\\iCloudDrive\\iJava\\Java_Projects\\AIProblemLists\\java_8_streams_api\\problem3\\file.txt";

        // TODO: Create a stream from this file, filter the titles that contain the word "Java", and count the number of such books
       try {

            long count = Files.lines(Paths.get(filePath))
                                .filter(title -> title.contains("Java"))
                                .count();


            System.out.println(count);

       } catch (IOException e) {
            e.printStackTrace();
       }
       
    }
}


/*Student Attempt Review: In the recent exercise involving Java Streams API, the student attempted to stream a file's content using a method that doesn't exist in the File class (file.stream()). 
This indicates a misunderstanding of how to handle file I/O in Java, especially regarding the java.nio package, which provides the appropriate tools for such tasks.

Key Learning Points for the Student:

Understanding Java I/O: The student needs a better grasp of file operations in Java, specifically the difference between java.io.File and java.nio.file.Files.
Stream API Usage: Familiarity with the Java Stream API, including methods like filter and count, is crucial. It seems the student understands the concept of streaming and filtering but struggles with applying it to file I/O.
Error Handling: The exercise exposed a lack of error handling in the student's code. Introducing concepts like try-catch blocks for handling IOException is necessary.
Recommendations:

A focused session on Java's file I/O mechanisms, contrasting java.io and java.nio.
Practical examples and exercises using Java Streams with different data sources, not just collections but also files.
Incorporate basic error handling practices in the curriculum to instill robust coding habits.
Overall, the student shows an eagerness to apply advanced concepts but needs guidance on the foundational aspects of Java file I/O and stream operations. */

//This Exercise regarded the domain of I/O Streams which is not the topic of this block of problems