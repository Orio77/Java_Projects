package Arrays;

public class Arr_ex12 {
    public static void main(String[] args) {

        int[] myArray = {1, 2, 3, 4, 5, 4};

        System.out.println(duplicateFinder(myArray));

    }
    
    public static int duplicateFinder(int[] array) {
        int duplicated = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i] == array[j] && i != j) {
                    duplicated = array[j];
                }

            }
        }

        System.out.println("(In case the number is 0, there are no duplicates in the array)");
        System.out.println("Duplicated element is: ");

        return duplicated;
    }
}






//12. Write a Java program to find duplicate values in an array of integer values.