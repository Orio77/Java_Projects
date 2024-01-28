package io_file_handling.problem3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Problem3CopyingAFile {
    public static void main(String[] args) {
        // Initialize a File object for the source file
        File sourceFile = new File("C:\\Users\\macie\\iCloudDrive\\iJava\\Java_Projects\\AIProblemLists\\io_file_handling\\problem2\\file.txt");

        // Initialize a File object for the destination file
        File destinationFile = new File("C:\\Users\\macie\\iCloudDrive\\iJava\\Java_Projects\\AIProblemLists\\io_file_handling\\problem3\\file.txt");

        // TODO: Use FileInputStream and FileOutputStream to copy the content of the source file to the destination file
        FileInputStream input = null;
        FileOutputStream output = null;
        FileInputStream newInput = null;
        FileInputStream newInput2 = null;
        try {
            input = new FileInputStream(sourceFile);
            output = new FileOutputStream(destinationFile);
            newInput = new FileInputStream(destinationFile);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        

        try {
            byte[] data = input.readAllBytes();
            output.write(data);
        } catch (IOException | NullPointerException e) {
            e.printStackTrace();
        }
        finally {
            try {
                output.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // TODO: Verify the content of the destination file is the same as the source file
        try { 
            newInput2 = new FileInputStream(sourceFile);
            if (Arrays.equals(newInput.readAllBytes(), newInput2.readAllBytes()));
                System.out.println("True");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                input.close();
                newInput.close();
                newInput2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
