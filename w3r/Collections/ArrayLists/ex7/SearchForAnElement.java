package Collections.ArrayLists.ex7;

import java.util.ArrayList;

import Collections.ArrayLists.AL_Tools;

public class SearchForAnElement {
    public static void main(String[] args) {
        
        ArrayList<Integer> myList = new ArrayList<>();

        AL_Tools.fillArrayList(myList);

        int element = 7;

        System.out.println(myList.contains(element));

        int i = 0;

        for (i = 0; i < myList.size(); i++) {
            if (myList.get(i) == element) {
                System.out.println("Index of an element is: " + i);
                break;
            }
        }

        System.out.println(myList.get(i));
    }
}

//7. Write a Java program to search for an element in an array list.