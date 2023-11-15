package Collections.ArrayLists.ex3;

import java.util.*;
import Collections.ArrayLists.AL_Tools;

public class InsertFirst {
    public static void main(String[] args) {
        
        ArrayList<Integer> myList = new ArrayList<>();

        AL_Tools.fillArrayList(myList);

        myList.add(0, 0);

        System.out.println(myList);
    }
}



//3. Write a Java program to insert an element into the array list at the first position.
