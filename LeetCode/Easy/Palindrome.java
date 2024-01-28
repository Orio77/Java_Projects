package Easy;

public class Palindrome {
    public static boolean isPalindrome(int x) {

        if (x == 0)
            return true;

        int sacrificeX = x;

        int i = 0;
        while (sacrificeX > 0) {
            i = i + 1;
            sacrificeX = sacrificeX / 10;
        }

        int[] numberToArray = new int[i];

        for (int j = 0; j < i && !(x < 1); j++) {
                int currentDigit = x % 10;
                numberToArray[j] = currentDigit;
                x = x / 10;
        }

        int[] reversedNumberToArray = new int[i];

        int helpful_k = i + 1;

        for (int j = 0; j < i; j++, helpful_k = helpful_k - 1) {
            reversedNumberToArray[j] = numberToArray[helpful_k - 2];
        }

        boolean verdict = false;

        for (int n = 0, m = 0; n < i; n++, m++)
            if (numberToArray[n] == reversedNumberToArray[m])
                verdict = true;
            else
                return false;

        return verdict;
    }
}



/*Given an integer x, return true if x is a palindrome, and false otherwise. */
