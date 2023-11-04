package Arrays;

public class Arr_ex2 {
    public static void main(String[] args) {

        int[] integerArray = {4, 5, 3, 234, 12, 45, 1234};
        System.out.println(arraySummer(integerArray));

    }

    private static int arraySummer(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        return sum;
    }
}








//2. Write a Java program to sum values of an array.