package Collections.ArrayLists.ex11;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            list.add(i);
        }
        System.out.println(list);

        reverse(list);
        System.out.println(list);
        
    }

    public static void reverse(ArrayList<Integer> arrayList) {
        
        Collections.reverse(arrayList);
    }
}
