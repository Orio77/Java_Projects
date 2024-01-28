package Collections.HashMap.ex1;

import java.util.HashMap;

public class HashMapExercises {
    public static void main(String[] args) {

        HashMap<Integer, String> myHashMap = new HashMap<>();
        myHashMap.put(1, "Red");
        myHashMap.put(2, "Blue");
        myHashMap.put(3, "Black");
        myHashMap.put(4, "White");
        myHashMap.put(5, "Orange");

        //1.
        // createPair(myHashMap);

        //2.
        // System.out.println(myHashMap);
        // countPairs(myHashMap);
        
    }

    //1. Write a Java program to associate the specified value with the specified key in a HashMap.
    public static void createPair(HashMap<Integer, String> hashMap) {
        hashMap.put(1, "Red");
        hashMap.put(2, "Blue");
        hashMap.put(3, "Black");
        hashMap.put(4, "White");
        hashMap.put(5, "Orange");

        System.out.println(hashMap);
    }

    //2. Write a Java program to count the number of key-value (size) mappings in a map.
    public static void countPairs(HashMap<Integer, String> hashMap) {
        System.out.println(hashMap.size());
    }

}
