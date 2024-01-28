package Collections.ArrayLists.ex18;

import java.util.ArrayList;

public class CheckIfEmpty {
    public static void main(String[] args) {

        ArrayList<Integer> myArrayList1 = new ArrayList<>(40);
        ArrayList<Integer> myArrayList2 = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            myArrayList1.add(i);
            myArrayList2.add(i);
        }
        
        check(myArrayList1);
    }

    public static boolean check(ArrayList<Integer> arrayList) {

        if (arrayList.isEmpty())
            return true;


        System.out.println("Size of the Array List: " + arrayList.size());
        System.out.println("Capacity of the Array List: " + getCapacity(arrayList));

        return false;
    }

    public static int getCapacity(ArrayList<?> arrayList) {

        try {
            java.lang.reflect.Field field = ArrayList.class.getDeclaredField("elementData");
            field.setAccessible(true);
            return ((Object[]) field.get(arrayList)).length;
        }
        catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}

