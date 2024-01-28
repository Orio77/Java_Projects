package Java_from_scratch.Arrays;

public class Arrays_Challenge_3 {
    public static void main(String[] args) {
        
        printMatrix(3);
    }

    private static void printMatrix(int n) {
        int[][] myArray = new int[n][n];

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                if (i == j) {
                    myArray[i][j] = 0;
                }
                else if (i > j) {
                    myArray[i][j] = -1;
                }
                else if (i < j) {
                    myArray[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
