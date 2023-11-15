package FileHandling.Ex2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class WriteContent {

    public static String fileName = "NewFile.txt";

    public static void useFileOutputStream() {


        try {
            File myfile = new File(fileName);
            if (myfile.exists() == false) {
                if (myfile.createNewFile())
                    System.out.println("File was created");
            }   else {
                System.out.println("File creation failed");
                System.exit(0);
            }

            String text;

            System.out.print("Enter text: ");
            try (Scanner sc = new Scanner(System.in)) {
                text = sc.nextLine();
            }

            FileOutputStream newtext = new FileOutputStream(myfile);
            newtext.write(text.getBytes());
            newtext.flush();
            newtext.close();

            System.out.println("File saved");
        }
        catch (IOException e){
            System.out.println("IOException caught");
        }
    }
}
