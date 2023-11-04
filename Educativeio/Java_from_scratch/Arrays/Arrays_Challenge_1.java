package Java_from_scratch.Arrays;

public class Arrays_Challenge_1 {
    public static void main (String[] args) {

        int myArray[] = {4, 6, 7, 1, 9, 235, 3, 2345};

        System.out.println();
        System.out.println(findMaxValue(myArray));
    }

    private static int findMaxValue(int[] array) {

        int max = 0;

        for (int i = 0; i < array.length ; i ++) {

            if (array[i] > max)
                max = array[i];
        }

        return max;
    }
}