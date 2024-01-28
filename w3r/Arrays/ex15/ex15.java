package Arrays.ex15;
import java.util.*;

public class ex15 {
    
    public static String commonIntegerFinder(int[] array_1, int[] array_2) {

        //some variables
        int duplicatedElements = 0;
        int k = 0;

        //Establishing the array with duplicated integer's length
        for (int i = 0; i < array_1.length; i++) {
            for (int j = 0; j < array_2.length; j++) {
                if (array_2[j] == array_1[i]) {
                duplicatedElements = duplicatedElements + 1;
                }
            }
        }

        //Creating the array with common elements
        int[] duplicatedArray = new int[duplicatedElements];

        for (int i = 0; i < array_1.length; i++) {
            for (int j = 0; j < array_2.length; j++) {
                if (array_2[j] == array_1[i]) {
                duplicatedArray[k] = array_2[j];
                k = k + 1;
                }
            }
        }
        return Arrays.toString(duplicatedArray);
    }
}



//15. Write a Java program to find common elements between two integer arrays.