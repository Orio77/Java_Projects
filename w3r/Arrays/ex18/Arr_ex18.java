package Arrays.ex18;
import java.util.*;

public class Arr_ex18 {
    
    public static int secondMinFinder(int[] array) {

        int min = array[0];
        int secondMin = array[0];
        int temp = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i] < min) 
                min = array[i];            
        }

        for (int j = 0; j < array.length; j++) {

            if (array[j] < secondMin) {
                if (secondMin != min) {
                    temp = secondMin;
                    secondMin = array[j];
                }
            }
            if (secondMin == min)
                secondMin = temp;
        }
        return secondMin;
    }

    public static int secondMinFinderUpgraded(int[] array) {

        int secondMin = 0;

        Arrays.sort(array);

        if (array.length > 1)
        secondMin = array[1]; 
        else
            System.out.println("Array is too short"); 

        return secondMin;
    }
}
