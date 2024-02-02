package Arrays.ex16_v2;
import java.util.Arrays;

public class Ex16_v2 {

    public static int[] duplicatedElementsRemoverV2(int[] array) {

        //System.out.println("Array before being fixed: " + Arrays.toString(array));
        int duplicatedCount = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i != j) {
                    duplicatedCount = duplicatedCount + 1;
                }
            }
        }
        duplicatedCount = duplicatedCount / 2;
        //System.out.println("Number of duplicated elements: " + duplicatedCount);
        int k = 0;

        int[] fixedArray = new int[array.length - duplicatedCount];
        boolean isDuplicated = false;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (j == fixedArray.length)
                    break;
                else {
                    if (fixedArray[j] == array[i]) {
                        isDuplicated = true;
                    }
                }
            }
            if (isDuplicated == false) {
                fixedArray[k] = array[i];
                k++;
                }
            isDuplicated = false;
        }
        //System.out.println(Arrays.toString(fixedArray));
        return fixedArray;
    }
     
    
    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(duplicatedElementsRemoverV2(array)));
    }
}




