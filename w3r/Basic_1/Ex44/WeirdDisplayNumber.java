package Basic_1.Ex44;

public class WeirdDisplayNumber {
    public static void tfIsThat(int number) {
        System.out.println(number + " + " + number + "" + number + " + " + number + "" + number + "" + number);
    }

    public static void huh(int number) {
        System.out.printf("%d + %d%d + %d%d%d\n", number, number, number, number, number, number);
    }
}
