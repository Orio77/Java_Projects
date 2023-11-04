package Basic_1.Ex33;

public class SumDigits {
    public static int add(int number_1) {

        int sum = 0;
        int digitToAdd;

        while (number_1 > 0) {
            digitToAdd = number_1 % 10;
            sum = sum + digitToAdd;
            number_1 = number_1 / 10;
        }

        return sum;
    }
}
