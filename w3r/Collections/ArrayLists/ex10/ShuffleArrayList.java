package Collections.ArrayLists.ex10;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            list.add(i);
        }
        System.out.println(list);

        
        shuffleArrayList(list);
        System.out.println(list);
        
    }

    public static void shuffleArrayList(ArrayList<Integer> arrayList) {

        Collections.shuffle(arrayList);
    }
}
