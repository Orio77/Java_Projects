package Collections.TreeSet.ex1;

import java.util.TreeSet;

public class CreateTreeSet {
    public static void main(String[] args) {
        
        TreeSet<String> myTreeSet = new TreeSet<>();

        myTreeSet.add("Blue");
        myTreeSet.add("Red");
        myTreeSet.add("Green");

        System.out.println(myTreeSet);
    }
}


//1. Write a Java program to create a tree set, add some colors (strings) and print out the tree set.