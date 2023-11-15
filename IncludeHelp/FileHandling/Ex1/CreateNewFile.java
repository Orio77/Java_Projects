package FileHandling.Ex1;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {

    public void createFile(String fileName) {
        File file1 = new File(fileName);

        try {
            if (file1.createNewFile()) {
                System.out.println("File created successfully at " + file1.getAbsolutePath());
            } else {
                System.out.println("File already exists at " + file1.getAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
