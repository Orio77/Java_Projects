package File_Handling.myProject;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;


public class CreateDirectories {
    public static void main(String[] args) {
        
        createDirectories("C:\\Users\\macie\\iCloudDrive\\iJava\\Java_Projects\\w3r\\Collections\\HashMap", 12);
        //copyMainMethod("C:\\Users\\macie\\iCloudDrive\\iJava\\Java_Projects\\w3r\\Arrays\\", 79);
    }

    public static void createDirectories(String path, int number_of_folders) {

        path = path + "\\ex";

        for (int i = 1; i <= number_of_folders; i++) {
            try {
                File directory = new File(path + "" + i);
                directory.mkdir();
            }
            catch (Exception e) {
                System.out.println("The following directory already exists: " + path + "" + i);
            }
        }

        System.out.println("Folder Creation completed");
    }

    public static void copyMainMethod(String pathToDirectory, int howManyDirectories) {

        String pathToMethod = "C:\\Users\\macie\\iCloudDrive\\iJava\\Java_Projects\\w3r\\Main.java";
        pathToDirectory = pathToDirectory + "ex";
        String savePath = pathToDirectory;

        for (int i = 1; i <= howManyDirectories; i++) {
            
            pathToDirectory = pathToDirectory + "" + i + "\\Main.java";
            System.out.println(pathToDirectory);
            
            try {
                Files.copy(Paths.get(pathToMethod), Paths.get(pathToDirectory));
            }
            catch (IOException e) {
                System.out.println("Failed to copy method to: " + "ex" + i );
                System.out.println("File already exists");
            }
            finally {
                pathToDirectory = savePath;
            }
        }
    }


}
