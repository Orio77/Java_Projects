package Basic_1.Ex42;

import java.io.Console;

public class EnterPassword {
    public static void enterPassword() {
        Console console;

        if ((console = System.console()) != null) {
            char[] pass_ward = null;

            try {
                pass_ward = console.readPassword("Input your Password: ");

                System.out.println("Your Passward was: " + new String(pass_ward));
            }
            finally {
                if (pass_ward != null)
                    java.util.Arrays.fill(pass_ward, ' ');
            }
        }
        else {
            throw new RuntimeException("Can't get the password... No console");
        }
    }
}
