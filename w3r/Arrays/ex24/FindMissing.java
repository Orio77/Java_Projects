package Arrays.ex24;

public class FindMissing {
    
    public static void find(int[] array) {

        int missingElement = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] != array[i] + 1) {
                missingElement = array[i] + 1;
                break;
            }
        }

        if (missingElement != 0) 
            System.out.println("Missing element: " + missingElement);
        else
            System.out.println("There are no missing elements");

    }
}
