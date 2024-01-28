package Arrays;
import java.util.Arrays;

public class Arr_ex1 {
    public static void main(String[] args) {

        int[] array1 = {1, 324, 255, 2346, 346};
        String[] array2 = {"Lowef", "Lol", "garden", "cop", "Male"};

        sorter(array1);
        sorter(array2);

    }
    private static void sorter(int[] integerArray) {
        Arrays.sort(integerArray);

        System.out.println(Arrays.toString(integerArray));
    }

    private static void sorter(String[] stringArray) {
        Arrays.sort(stringArray);

        System.out.println(Arrays.toString(stringArray));
    }
}








//1. Write a Java program to sort a numeric array and a string array.