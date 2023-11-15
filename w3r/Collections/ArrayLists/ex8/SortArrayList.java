package Collections.ArrayLists.ex8;

import java.util.ArrayList;

import Collections.ArrayLists.AL_Tools;

public class SortArrayList {
    public static void main(String[] args) {
        
        ArrayList<Integer> myList = new ArrayList<>();

        AL_Tools.fillArrayList(myList);

        myList.add(3);
        myList.add(17);
        System.out.println(myList);

        myList.sort(null);
        System.out.println(myList);

    }
}

//8. Write a Java program to sort a given array list.
