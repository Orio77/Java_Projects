package io_file_handling.problem1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

public class ReadingTextFile {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\macie\\Downloads\\bib.txt");
        Reader reader = null;
        BufferedReader bufferReader = null;
        
        try {
            reader = new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8);
            bufferReader = new BufferedReader(reader);
            System.out.println(reader);
            String line;
            while ((line = bufferReader.readLine()) != null) {
                System.out.println(line);
            }
        } 
        catch (FileNotFoundException e) {
            e.getStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (bufferReader != null) {
                    bufferReader.close();
                }
                if (reader != null) {
                    reader.close();
                }
            } 
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

/*Properly structured try-catch-finally blocks to handle exceptions and ensure resources are closed.
Areas of struggle:

Understanding Java's type system: There was confusion about the difference between FileReader and InputStreamReader. Remember, FileReader is a convenience class for reading character files. InputStreamReader is a bridge from byte streams to character streams. It reads bytes and decodes them into characters using a specified charset.

Dealing with character encoding issues: The text file was not being read correctly due to a mismatch in character encoding. It's crucial to understand that text files need to be read with the same encoding they were written with.

Areas for improvement:

Exception handling: Instead of e.getStackTrace();, use e.printStackTrace(); to print the details of an exception. The getStackTrace() method returns an array of stack trace elements, and to print them, you need to iterate over this array.

Error messages: When catching FileNotFoundException, it would be helpful to include a user-friendly error message, such as "File not found: " + file.getPath().

Null checks: Before closing bufferReader and reader, you correctly checked if they are null. However, if bufferReader.close(); throws an exception, reader will not be closed. To ensure all resources are closed, each close() call should be in its own try-catch block.

Code comments: While your code is generally well-structured and easy to follow, adding comments to explain what each part of the code does would make it easier for others to understand. */