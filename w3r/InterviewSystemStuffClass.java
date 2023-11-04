import java.nio.charset.Charset;

public class InterviewSystemStuffClass {
    
    //Prints all character sets
    public static void printAllCharsetObjects() {

        System.out.println(Charset.availableCharsets());
    }

    public static int returnASCII_Value(char character) {

        int ASCII = 0;
        ASCII = (int)character;
        System.out.println("ASCII value of " + character + " is: " + ASCII);

        return ASCII;
    }

}
