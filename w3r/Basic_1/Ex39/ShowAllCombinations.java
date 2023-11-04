package Basic_1.Ex39;
import java.util.Arrays;

public class ShowAllCombinations {

    public static void digits_MyTry_Failed() {

        String[] allElements = new String[4];
        allElements[0] = "1";
        allElements[1] = "2";
        allElements[2] = "3";
        allElements[3] = "4";
        String[] allCombinations = new String[3];
        String[] allCombinationsList = new String[24];

        for (int i = 0; i < allElements.length; i++) {
            for (int j = 0; j < allElements.length; j++) {
                try {
                    allCombinations[j] = allElements[i];
                } 
                catch (ArrayIndexOutOfBoundsException e) {
                    continue;
                }
                allCombinationsList[i*4 + j] = allCombinations[j];
                System.out.println(Arrays.toString(allCombinationsList));
            }
        }

        System.out.println(Arrays.toString(allCombinationsList));
    }

    public static void showDigits() {

        byte amount = 0;

        for (int i = 1; i <=4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    if (i != j && j != k && k != i) {
                        amount++;
                        System.out.println(i + "" + j + "" + k);
                    }
                }
            }
        }

        System.out.println("The amount of all combinations is: " + amount);
    }
}
