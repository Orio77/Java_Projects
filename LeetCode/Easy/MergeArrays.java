import java.util.Arrays;

public class MergeArrays {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        if (m == 0 && n == 0)
            return;
        if (n == 0)
            return;
        if (m == 0) {
            for (int i = 0; i < nums2.length; i++) {
                nums1[i] = nums2[i];
            }
        }

        for (int i = m, j = 0; i < m + n; i++, j++) {
            nums1[i] = nums2[j];
        }

        Arrays.sort(nums1);
    }
}
