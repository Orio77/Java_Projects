package Collections.ArrayLists.ex15;

import java.util.ArrayList;
import java.util.Iterator;

public class MergeArrayLists {
    public static void main(String[] args) {

        ArrayList<Integer> myArrayList1 = new ArrayList<>();
        ArrayList<Integer> myArrayList2 = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            myArrayList1.add(i);
            myArrayList2.add(i);
        }

        System.out.println(merge(myArrayList1, myArrayList2));
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> arrayList1, ArrayList<Integer> arrayList2) {

        ArrayList<Integer> mergedArrayList = new ArrayList<>();

        mergedArrayList.addAll(arrayList1);
        mergedArrayList.addAll(arrayList2);

        // Iterator<Integer> iterator1 = arrayList1.iterator();
        // Iterator<Integer> iterator2 = arrayList2.iterator();

        // while (iterator1.hasNext()) {
        //     mergedArrayList.add(iterator1.next());
        // }

        // while (iterator2.hasNext()) {
        //     mergedArrayList.add(iterator2.next());
        // }

        return mergedArrayList;
    }
}
