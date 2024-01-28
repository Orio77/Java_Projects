package Arrays.ex25;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {1, 2, 3, 5, 6};

        System.out.println(Arrays.toString(FindCommons.commonElements(array1, array2, array3)));

    }
}
