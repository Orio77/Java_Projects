package Arrays;

public class Arr_ex5 {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 5, 6};

        System.out.println(valueFinder(myArray, 4));
        System.out.println(forEachValueFinder(myArray, 5));

    }

    public static boolean valueFinder(int[] array, int value) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == value)
                return true;
        }
        return false;
    }
    public static boolean forEachValueFinder(int[] array, int value) {

        for (int n : array) {
            if (value == n)
                return true;
        }
        return false;
    }
}



//5. Write a Java program to test if an array contains a specific value.