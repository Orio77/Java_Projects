package Collections.ArrayLists.ex2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("One");
        stringArrayList.add("Two");
        stringArrayList.add("Three");
        stringArrayList.add("Four");
        stringArrayList.add("Five");

        ListIterator iterator = new ListIterator();

        iterator.iterate(stringArrayList);
    }
}


//2. Write a Java program to iterate through all elements in an array list.