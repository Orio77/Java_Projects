package io_file_handling.problem5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Problem5WritingToABinaryFile {
    public static void main(String[] args) {
        // Initialize an array of bytes
        byte[] bytes = new byte[] {1, 2, 3, 4, 5};

        // Initialize a File object for the binary file
        File binaryFile = new File("C:\\Users\\macie\\iCloudDrive\\iJava\\Java_Projects\\AIProblemLists\\io_file_handling\\problem5\\binaryFile.bin");

        // TODO: Use FileOutputStream to write these bytes to the binary file

        try (FileOutputStream output = new FileOutputStream(binaryFile)) {
            output.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // TODO: Verify the content of the binary file

        System.out.println(Arrays.toString(bytes));
    }
}