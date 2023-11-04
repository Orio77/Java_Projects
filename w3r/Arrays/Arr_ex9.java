package Arrays;
import java.util.*;

public class Arr_ex9 {
    public static void main(String[] args) {

        int myArray[] = {1, 2, 3, 4, 6, 7};

        System.out.println(insertIntoArray(myArray, 5, 5));
    }
    public static String insertIntoArray(int[] array, int number, int position) {

        int createdArray[] = new int[array.length + 1];

        for (int i = 0, j = 0; i < array.length; i++, j ++) {

            if (j == position) {
                createdArray[i] = number;
                j++;
            }
            createdArray[j] = array[i];
        }

        return Arrays.toString(createdArray);
    }
}






//9. Write a Java program to insert an element (specific position) into an array.