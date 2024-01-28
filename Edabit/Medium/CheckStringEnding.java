package Medium;

public class CheckStringEnding {
    public static boolean checkEnding(String str1, String str2) {

        if (str1.length() >= str2.length()) {
            int beginningInxed = str1.length() - str2.length();

            String testString = str1.substring(beginningInxed);

            if (testString.matches(str2))
                return true;
            else
                return false;
        }
        else
            return false;
    }
}



/*Create a function that takes two strings and returns true if the first string ends with the second string; otherwise return false. */