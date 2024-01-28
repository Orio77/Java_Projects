package Collections.ArrayLists.ex16;

import java.util.ArrayList;

public class Clone {
    public static void main(String[] args) {
        
        ArrayList<Integer> myArrayList1 = new ArrayList<>();
        ArrayList<Integer> myArrayList2 = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            myArrayList1.add(i);
            myArrayList2.add(i);
        }

        System.out.println(clone(myArrayList2));

    }

    public static ArrayList<Integer> clone(ArrayList<Integer> arrayList) {

        return (ArrayList<Integer>) (arrayList.clone());
    }
}
