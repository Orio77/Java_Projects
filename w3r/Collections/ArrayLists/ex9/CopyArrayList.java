package Collections.ArrayLists.ex9;

import java.util.ArrayList;

import Collections.ArrayLists.AL_Tools;

public class CopyArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();

        AL_Tools.fillArrayList(myList);

        ArrayList<Integer> newList = new ArrayList<>();

        System.out.println(myList);

        for (int i = 0; i < myList.size(); i++) {
            newList.add(myList.get(i));
        }

        System.out.println("Copied List: ");
        System.out.println(newList);
    }
}

//9. Write a Java program to copy one array list into another.
