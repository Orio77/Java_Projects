package Arrays.ex21;

import java.util.ArrayList;

public class ConvertArray {
    
    public static int[] convertArrayList(ArrayList<Integer> arrayList) {

        int[] array = new int[arrayList.size()];

        for (int i = 0; i < arrayList.size(); i++) {
            array[i] = arrayList.get(i);
        }

        return array;
    }
}
