package Arrays.ex22;

import java.util.ArrayList;

public class FindPairsThatSum {
    
    public static ArrayList<String> findPairs(int[] array, int number) {

        ArrayList<String> listOfPairs = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == number) {
                    listOfPairs.add("(" + array[i] + "," + array[j] + ")");
                }
            }
        }

        return listOfPairs;
    }
}
