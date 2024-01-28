package Java_from_scratch.Methods;
public class Methods_Challange_4 {
    public static void main(String[] args) {

        System.out.println(stringModifier("wfhowOUGDOoqodHDOQDD"));

    }

    private static String stringModifier(String yourString) {

        int lengthChecker = yourString.length();
        String modifiedString = "";

        if (lengthChecker % 2 == 0) {
            modifiedString = yourString.toUpperCase();
        }
        else if (lengthChecker % 2 != 0) {
            modifiedString = yourString.toLowerCase();
        }
        else
            System.out.println("Invalid string");

        return modifiedString;
    }
}
