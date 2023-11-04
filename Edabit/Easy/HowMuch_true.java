package Easy;

public class HowMuch_true {
    
    public static int countTrue(boolean[] array) {

        int thisMuchTrue = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == true) {
                thisMuchTrue = thisMuchTrue + 1;
            }
        }
        return thisMuchTrue;
    }
}