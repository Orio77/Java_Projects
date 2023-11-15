package Collections.ArrayLists.ex6;

import java.util.ArrayList;

import Collections.ArrayLists.AL_Tools;

public class RemoveThirdElement {
    public static void main(String[] args) {
        
        ArrayList<Integer> myList = new ArrayList<>();

        AL_Tools.fillArrayList(myList);

        System.out.println(myList);
        myList.remove(2);
        System.out.println(myList);

    }
}

//6. Write a Java program to remove the third element from an array list.
