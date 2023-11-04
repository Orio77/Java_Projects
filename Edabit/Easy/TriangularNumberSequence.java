package Easy;

public class TriangularNumberSequence {
    
    public static int countTriangular(int number) {
        int triangularCounted = 0;
        int temp = 0;

        for(int i = 1; i <= number; i++) {
            temp = triangularCounted;

            triangularCounted = temp + i;
        }
        return triangularCounted;
    }
}



// 1, 3, 6, 10, , ni = n(i - 1) + n