package File_Handling.Ex1;

import java.io.File;
import java.util.Arrays;

public class ListFiles {
    public static void showFiles(String path) {
        File myFile = new File(path);

        System.out.println(Arrays.toString(myFile.list()));
    }
}
