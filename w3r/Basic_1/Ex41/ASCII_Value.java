package Basic_1.Ex41;

public class ASCII_Value {
    public static int returnASCII_Value(char character) {

        int ASCII = 0;
        ASCII = (int)character;
        System.out.println("ASCII value of " + character + " is: " + ASCII);

        return ASCII;
    }

}
