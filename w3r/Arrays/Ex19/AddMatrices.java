package Arrays.ex19;

public class AddMatrices {
    public static int[][] add(int[][] matrix1, int[][] matrix2) { 

        if (matrix1 == null || matrix2 == null) {
            throw new IllegalArgumentException("One of the matrices is null.");
        }
    
        // Check if dimensions match
        if (matrix1.length == 0 || matrix2.length == 0 || matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            throw new IllegalArgumentException("Matrix dimensions must match.");
        }

        int[][] resultMatrix = new int[matrix1.length][matrix1[0].length];

        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix[i].length; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return resultMatrix;

    }
}
