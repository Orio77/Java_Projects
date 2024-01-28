package Exception_Handling.Ex2;

public class DontOdd {
    public static void giveMeNumber(int number) {

        try {
            checkNumber(number);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Don't odd with me!");
        }
        finally {
            System.out.println("Your number is: " + number);
        }
    }

    public static void checkNumber(int number) {
        if (number % 2 != 0) 
            throw new IllegalArgumentException();
    }
}
