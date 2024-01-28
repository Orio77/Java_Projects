package io_file_handling.problem6;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem6UnderstandingCharacterEncoding {
    public static void main(String[] args) {
        // Initialize a File object for the text file
        File textFile = new File("C:\\Users\\macie\\iCloudDrive\\iJava\\Java_Projects\\AIProblemLists\\io_file_handling\\problem6\\file.txt");

        // Initialize the character encoding
        String encoding = "UTF-8"; // or "ISO-8859-1"

        // TODO: Use InputStreamReader to read this file with the correct character encoding

        try (FileInputStream input = new FileInputStream(textFile);
            InputStreamReader reader = new InputStreamReader(input, encoding)
        ) { 
            int read = 0;
            while ((read = reader.read()) > -1) {
                System.out.println((char) read);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // TODO: Print the content of the file to the console
    }
}
