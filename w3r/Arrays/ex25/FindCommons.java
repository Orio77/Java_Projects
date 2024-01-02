package Arrays.ex25;

public class FindCommons {
    
    public static int[] commonElements(int[] array1, int[] array2, int[] array3) {

        int[] arrayOfCommons = new int[array1.length];
        int commonElementCount = 0;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    for (int k = 0; k < array3.length; k++) {
                        if (array2[j] == array3[k]) {
                            arrayOfCommons[commonElementCount] = array3[k];
                            commonElementCount++;
                        }
                    }
                }
            }
        }

        int[] returnArray = new int[commonElementCount];

        for (int i = 0; i < commonElementCount; i++) {
            returnArray[i] = arrayOfCommons[i];
        }

        return returnArray;
    }
}
