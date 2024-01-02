package io_file_handling.problem2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem2WritingToATextFile {
    public static void main(String[] args) {
        // Initialize a List of strings
        List<String> strings = new ArrayList<>(Arrays.asList("Hello", "World", "Java", "IO"));

        // TODO: Use a FileWriter to write these strings to a text file
        FileWriter writer = null;

        File file = new File("io_file_handling\\problem2\\file.txt");
        try {
            writer = new FileWriter(file);
            for (String string : strings) {
                writer.append(string);
                writer.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                writer.close();
            } catch (IOException | NullPointerException e) {
                e.printStackTrace();
            }
        }

        // TODO: Ensure each string is on a new line in the file
    }
}
