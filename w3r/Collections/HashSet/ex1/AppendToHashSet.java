package Collections.HashSet.ex1;

import java.util.HashSet;

public class AppendToHashSet {
    public static void main(String[] args) {

        HashSet<Integer> myHashSet = new HashSet<>();

        for (int i = 0; i < 20; i++) {
            myHashSet.add((int) (Math.random() * 10 * Math.random() * 10));
        }

        myHashSet.add(17);

        System.out.println(myHashSet);
    }
}



//1. Write a Java program to append the specified element to the end of a hash set.