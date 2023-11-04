package Medium;

public class WarOfNumbers {
    public static int endWar(int[] numbers) {

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0)
                evenSum = evenSum + numbers[i];
            else
                oddSum = oddSum + numbers[i];
        }

        return evenSum > oddSum ? evenSum - oddSum : oddSum - evenSum;
    }
}




/*There's a great war between the even and odd numbers. 
Many numbers already lost their lives in this war and it's your task to end this. 
You have to determine which group sums larger: the evens, or the odds. The larger group wins.

Create a function that takes an array of integers, sums the even and odd numbers separately, 
then returns the difference between the sum of the even and odd numbers. */