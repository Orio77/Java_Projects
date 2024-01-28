package Arrays.ex26;

import java.util.Arrays;

public class MoveZeros {
    
    public static void moveToTheEnd(int[] array) {

        int saveElement;
        boolean swapped = false;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if(array[j] == 0 && array[j + 1] != 0) {
                    saveElement = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = saveElement;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }

        System.out.println(Arrays.toString(array));
    }
}
