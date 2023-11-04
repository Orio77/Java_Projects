package Arrays;

public class Arr_ex3 {

    public static void main(String[] args) {
        gridPrinter(100, 30);

    }
    private static void gridPrinter(int rows, int collumns) {

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < collumns; j++) {
                    System.out.print("-");
                }
                System.out.println();
        }
    }    
}




/*3. Write a Java program to print the following grid.

Expected Output :

- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - - 

*/