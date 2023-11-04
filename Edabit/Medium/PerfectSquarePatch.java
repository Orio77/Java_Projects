package Medium;

public class PerfectSquarePatch {
    public static int[][] createMatrice(int number) {

        int[][] perfectMatrice = new int[number][number];

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                perfectMatrice[i][j] = number;
            }
        }
        return perfectMatrice;
    }
}




/*Create a function that takes an integer and outputs an n x n square solely consisting of the integer n. */