package Collections.ArrayLists.ex5;

import java.util.ArrayList;

import Collections.ArrayLists.AL_Tools;

public class ReplaceElement {
    public static void main(String[] args) {
        
        ArrayList<Integer> myList = new ArrayList<>();

        AL_Tools.fillArrayList(myList);

        System.out.println(myList);
        myList.remove(7);
        System.out.println(myList);
        myList.add(7, 15);
        System.out.println(myList);
    }
}

//5. Write a Java program to update an array element by the given element.
