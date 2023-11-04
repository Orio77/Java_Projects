package Arrays;

import java.util.*;

public class Arr_ex8 {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(arrayCopier(array1));
    }
    public static String arrayCopier(int[] array) {

        int newArray[] = new int[array.length];

        for (int i = 0, j = 0; i < array.length; i++, j++ ) {

            newArray[j] = array[i];
        }

        return Arrays.toString(newArray);
    }
}







//8. Write a Java program to copy an array by iterating the array.