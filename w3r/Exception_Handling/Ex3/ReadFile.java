package Exception_Handling.Ex3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void enterFile(String name) {

        FileReader file = null;

        try {

        file = new FileReader(name);

        file.read();
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            if (file != null)
                try {
                    file.close();
                } catch (IOException e) {
                    e.getMessage();
                }
        }
    }
}
