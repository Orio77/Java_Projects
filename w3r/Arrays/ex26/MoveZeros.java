package Arrays.ex26;

import java.util.Arrays;

public class MoveZeros {
    
    public static void moveToTheEnd(int[] array) {

        int saveElement;
        boolean swapped = false;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i] == 0) {
                    saveElement = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = saveElement;
                    swapped = true;
                }
                if (swapped == false)
                    break;
                swapped = false;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
