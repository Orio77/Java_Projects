package io_file_handling.problem4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Problem4ReadingABinaryFile {
    public static void main(String[] args) {
        // Initialize a File object for the binary file
        File binaryFile = new File("C:\\Users\\macie\\iCloudDrive\\iJava\\Java_Projects\\AIProblemLists\\io_file_handling\\problem4\\binaryFile.bin");

        // TODO: Use FileInputStream to read this file
        FileInputStream input = null;
        try {
            input = new FileInputStream(binaryFile);
            byte[] data = input.readAllBytes();
            System.out.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // TODO: Print the content of the file to the console in hexadecimal format
    }
}
