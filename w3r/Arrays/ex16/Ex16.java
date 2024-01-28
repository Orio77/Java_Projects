package Arrays.ex16;
import java.util.*;

public class Ex16 {
    
    public static int[] commonElementsRemover(int[] array) {

        int[] fixedArray = new int[array.length];
        boolean isCoomon = false;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == array[i] && j != i) {
                        isCoomon = true;
                }

                if (isCoomon == false) {
                    fixedArray[i] = array[i];
                }
                isCoomon = false;
            }
        }
        System.out.println(Arrays.toString(fixedArray));
        return fixedArray;
    }
}




//16. Write a Java program to remove duplicate elements from an array.