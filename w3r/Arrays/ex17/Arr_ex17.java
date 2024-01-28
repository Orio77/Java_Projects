package Arrays.ex17;
import java.util.*;

public class Arr_ex17 {
    
    public static int findSecondLargest(int[] array) {

        int max = array[0];
        int secondMax = array[0];
        int temp = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }

        for (int j = 0; j < array.length; j++) {

            if (array[j] > secondMax && secondMax != max) {
                secondMax = array[j];
                if (secondMax != max) 
                    temp = secondMax;
                else if (secondMax == max)
                    secondMax = temp;
            }
        }
        return secondMax;
    }

    public static int findSecondLargerstUpgraded(int[] array) {

        Arrays.sort(array);

        int index = array.length - 1;
        int secondMax = 0;

        int i = 0;
        while (i < index) {
            secondMax = array[i];
            i++;
        }

        return secondMax;
    }
}





//17. Write a Java program to find the second largest element in an array.