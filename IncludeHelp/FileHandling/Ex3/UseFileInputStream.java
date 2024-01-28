package FileHandling.Ex3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.File;

public class UseFileInputStream {
    
    public static void read() {

        try {

            String path = "C:\\Users\\macie\\iCloudDrive\\iJava\\Java_Projects\\IncludeHelp\\NewFile.txt";
            File readThisFile = new File("path");

            FileInputStream newText = new FileInputStream("NewFile.txt");

            newText.read();
        }
        catch (FileNotFoundException e){
            System.out.println("File was not found");
        }

        
    }
}