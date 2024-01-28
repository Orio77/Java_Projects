package Arrays;
import java.util.Arrays;

public class Arr_ex7 {
    public static void main(String[] args) {

        int[] someArray = {1, 2, 3, 4, 5};

        System.out.println(removeFromArray(someArray, 4));

    }
    public static String removeFromArray(int[] array, int number) {
        int i = 0;
        int j = 0;
        int[] newArray = new int[array.length - 1];

        while (i < array.length) {
            if (array[i] == number) {
                i++;
                continue;
            }
            else {
                newArray[j] = array[i];
                i++;
                j++;
            }
        }
        return Arrays.toString(newArray);
    } 
}



//7. Write a Java program to remove a specific element from an array.