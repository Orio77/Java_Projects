package Collections.ArrayLists.ex14;

import java.util.ArrayList;

public class SwapElements {
    public static void main(String[] args) {

        ArrayList<Integer> myArrayList1 = new ArrayList<>();
        ArrayList<Integer> myArrayList2 = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            myArrayList1.add(i);
            myArrayList2.add(i);
        }

        swap(myArrayList1, myArrayList2, 4, 8);
    }
    

    public static void swap(ArrayList<Integer> arrayList1, ArrayList<Integer> arrayList2, int index1, int index2) {

        int element1 = arrayList1.get(index1);
        int element2 = arrayList2.get(index2);

        arrayList1.remove(index1);
        arrayList1.add(index1, element2);

        arrayList2.remove(index2);
        arrayList2.add(index2, element1);

        System.out.println(arrayList1);
        System.out.println(arrayList2);
    }
}
