package Java_from_scratch.Methods;
public class Methods_Challange_3 {
    
    public static void main(String[] args) {

        System.out.println(numSummer(235235));

    }

    public static int numSummer(int number) {
        int sum = 0;

        while (number>0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }
}
