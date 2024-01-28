package Arrays;

public class Arr_ex4 {
    public static void main(String[] args) {

        int testArray[] = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(arrayAverager(testArray));
    }

    public static double arrayAverager(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        double average = sum / array.length;

        return average;
    }
}



//4. Write a Java program to calculate the average value of array elements.