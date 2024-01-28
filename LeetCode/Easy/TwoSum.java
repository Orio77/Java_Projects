package Easy;

import java.util.Arrays;

class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        int i = 0;
        int j = 0;
        int[] returnIndices = new int[2];

        for_i:
        for (i = 0; i < nums.length; i++) {
            for (j = 1; j < nums.length; j++) {

                    if (nums[i] + nums[j] == target) {
                        if (i != j)
                            break for_i;
                    }
            }
        }
        returnIndices[0] = i;
        returnIndices[1] = j;

        return returnIndices;
    }

    public static void main(String[] args) {
        int[] nums = {-3,4,3,90};
        int target = 0;
        System.out.println(Arrays.toString(twoSum(nums, target)));

    }
}



/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order. */