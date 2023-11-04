package Arrays;

public class Arr_ex13 {
    public static void main(String[] args) {

        String[] myArray = {"lol", "dog", "cat", "lol"};

        System.out.println(findDuplicatedString(myArray));
    } 

    public static String findDuplicatedString(String[] array) {
        String duplicated = "";

        for (int i = 0; i < array.length; i++) {
            String currentElement = array[i];
            for (int j = 0; j < array.length; j++) {
                if (currentElement.matches(array[j]) && i != j) {
                    duplicated = array[j];
                }
            }
        }

        if (duplicated.matches("")) {
            System.out.print("There are no duplicated elements in the array");
            return duplicated;
        }
        else {
            System.out.println("The duplicated string is: ");
            return duplicated;
        }
    }
}





//13. Write a Java program to find duplicate values in an array of string values.