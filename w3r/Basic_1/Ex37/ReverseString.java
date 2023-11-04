package Basic_1.Ex37;

public class ReverseString {
    public static String reverse(String String) {

        String reversedString = "";
        String character = "";

        for (int i = 0; i <= String.length(); i++) {

            if (i == 0)
                character = String.substring(String.length() - i, String.length());
            else
                character = String.substring(String.length() - i, String.length() - i + 1);

            reversedString = reversedString + character;
        }
        return reversedString;
    }
}
