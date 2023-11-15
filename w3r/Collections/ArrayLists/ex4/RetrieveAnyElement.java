package Collections.ArrayLists.ex4;

import java.util.ArrayList;

import Collections.ArrayLists.AL_Tools;

public class RetrieveAnyElement {
    public static void main(String[] args) {
        
        ArrayList<Integer> myList = new ArrayList<>();

        AL_Tools.fillArrayList(myList);
        System.out.println(myList);

        System.out.println(myList.get(8));
    }   
}



//4. Write a Java program to retrieve an element (at a specified index) from a given array list.
