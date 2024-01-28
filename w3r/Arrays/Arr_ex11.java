package Arrays;
import java.util.*;

public class Arr_ex11 {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5, 6};

        arrayReverser(array1);
        
    }

    public static void arrayReverser(int[] array) {

        int[] reversedArray = new int[array.length];

        for (int i = 0, j = array.length - 1; i < array.length; i++, j --) {

            reversedArray[j] = array[i];
        }

        System.out.println(Arrays.toString(reversedArray));
    }
}




//11. Write a Java program to reverse an array of integer values.
