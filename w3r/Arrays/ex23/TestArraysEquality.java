package Arrays.ex23;

public class TestArraysEquality {
    
    public static boolean areEqual(int[] array1, int[] array2) {
        
        if (array1.length != array2.length)
            return false;

        int counter = 0;

        for (int i = 0; i < array2.length; i++) {
            if (array1[i] == array2[i])
                counter++;
        }

        if (counter == array1.length)
            return true;
        else
            return false;
    }
}
