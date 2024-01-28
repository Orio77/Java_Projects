package DataStructures.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class Subarray_with_given_sum {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 5, 7};

        System.out.println(subarraySum(array1, 5, 12));
    }

    
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {

        ArrayList<Integer> wrongList = new ArrayList<>(1);
        wrongList.add(-1);
        ArrayList<Integer> correctList = new ArrayList<>();
        ArrayList<Integer> answerList = new ArrayList<>();

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            correctList.add(arr[i]);
        }

        int sum = 0;
        int i = 0;
        int j = 0;
        int closestApproximation;

        while (sum < s) {
            sum = sum + correctList.get(i);
            i++;
        }

        while (true) {

            if (sum < s) {
                sum = sum - correctList.get(j) + correctList.get(i);
                if (sum == s) {
                    answerList.add(j);
                    answerList.add(i);
                    return answerList;
                }
            }

            if (sum > s) {
                sum = sum - correctList.get(j);
                if (sum == s) {
                    answerList.add(j);
                    answerList.add(i);
                    return answerList;
                }
            }    
            i++;
            j++;
        }
    }

}
