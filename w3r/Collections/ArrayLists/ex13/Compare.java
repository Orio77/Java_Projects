package Collections.ArrayLists.ex13;

import java.util.ArrayList;
import java.util.Iterator;


public class Compare {
    public static void main(String[] args) {

        ArrayList<Integer> myArrayList1 = new ArrayList<>();
        ArrayList<Integer> myArrayList2 = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            myArrayList1.add(i);
            myArrayList2.add(i);
        }

        System.out.println(areEqual(myArrayList1, myArrayList2));
        
    }

    public static boolean areEqual(ArrayList<Integer> arrayList1, ArrayList<Integer> arrayList2) {

        int length1 = arrayList1.size();
        int length2 = arrayList2.size();

        if (length1 != length2)
            return false;

        Iterator<Integer> iterator1 = arrayList1.iterator();
        Iterator<Integer> iterator2 = arrayList2.iterator();

        while (iterator1.hasNext()) {

            if (!iterator1.next().equals(iterator2.next()))
                return false;
        }
        return true;
    }
}


//13. Write a Java program to compare two array lists.