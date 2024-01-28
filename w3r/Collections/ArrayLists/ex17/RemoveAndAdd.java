package Collections.ArrayLists.ex17;

import java.util.ArrayList;

public class RemoveAndAdd {
    public static void main(String[] args) {
        
        ArrayList<Integer> myArrayList1 = new ArrayList<>();
        ArrayList<Integer> myArrayList2 = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            myArrayList1.add(i);
            myArrayList2.add(i);
        }

        System.out.println(removeAdd(myArrayList1));
    }

    public static ArrayList<Integer> removeAdd(ArrayList<Integer> arrayList) {
        
        int sum = 0;

        for (int i = arrayList.size() - 1; i >= 0 ; i--) {
            sum = sum + arrayList.get(i);
            arrayList.remove(i);
        }

        System.out.println("Sum of the removed numbers: " + sum);

        return arrayList;
    }
}