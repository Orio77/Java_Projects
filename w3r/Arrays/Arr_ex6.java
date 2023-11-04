package Arrays;

public class Arr_ex6 {
    public static void main(String[] args) {

        int myarray[] = {3, 4, 5, 6, 2345};
        indexFinder(myarray, 3);

    }
    public static void indexFinder(int[] array, int number) {

        for (int i = 0; i < array.length; i++) {
            int index = i + 1;
            if (number == array[i]) 
                System.out.println("Index of Your element is: " + index);
        }
    }
}


//6. Write a Java program to find the index of an array element.