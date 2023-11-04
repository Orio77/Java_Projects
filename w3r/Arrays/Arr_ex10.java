package Arrays;

public class Arr_ex10 {
    public static void main(String[] args) {

        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.print("Minimum value of the array is: ");
        System.out.println(minValue(myArray));
        System.out.print("Maximum value of the array is: ");
        System.out.println(maxValue(myArray));

    }

    public static int minValue(int[] array) {
        int min = 0;

        for (int i = 0; i < array.length; i ++) {
            if (i == 0) {
                min = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int maxValue(int[] array) {
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }

        return max;
    }
}









//10. Write a Java program to find the maximum and minimum value of an array.