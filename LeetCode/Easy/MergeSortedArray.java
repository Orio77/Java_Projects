package Easy;

import java.util.Arrays;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
        for (int i = 0, j =0; i < nums1.length; i++) {
            if (nums2[j] <= nums1[i]) {
                nums1[i + 2] = nums1[i];
                nums1[i] = nums2[j];
                j++;
                System.out.println(Arrays.toString(nums1));
            }
            if (i >= m + j) {
                nums1[i] = nums2[j];
                j++;
            }
            System.out.println(Arrays.toString(nums1));
        }

        System.out.println(Arrays.toString(nums1));
    }
}
