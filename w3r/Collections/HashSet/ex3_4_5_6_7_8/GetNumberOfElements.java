package Collections.HashSet.ex3_4_5_6_7_8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class GetNumberOfElements {
    public static void main(String[] args) {
        
        HashSet<Integer> myHashSet = new HashSet<>();

        for (int i = 0; i < 20; i++) {
            myHashSet.add((int) (Math.random() * 10 * Math.random() * 10));
        }

        // 3.
        // System.out.println(myHashSet);
        // numberOfElements(myHashSet);

        //4. 
        // System.out.println(myHashSet);
        // emptyTheHashSet(myHashSet);
        // System.out.println(myHashSet);

        //5.
        // System.out.println(myHashSet);
        // emptyTheHashSet(myHashSet);
        // System.out.println(myHashSet);
        // System.out.println(isEmpty(myHashSet));

        //6.
        // System.out.println(myHashSet);
        // System.out.println(cloneHashSet(myHashSet));

        //7.
        // System.out.println(myHashSet);
        // hashSetToArray(myHashSet);

        //8.
        System.out.println(myHashSet);
        hashToTree(myHashSet);

    }

    //3. Write a Java program to get the number of elements in a hash set.
    public static void numberOfElements(HashSet<Integer> hashSet) {
        System.out.println(hashSet.size());
    }

    //4. Write a Java program to empty an hash set.
    public static void emptyTheHashSet(HashSet<Integer> hashSet) {
        hashSet.clear();
    }

    //5. Write a Java program to test if a hash set is empty or not.
    public static boolean isEmpty(HashSet<Integer> hashSet) {
        return hashSet.isEmpty();
    }

    //6. Write a Java program to clone a hash set to another hash set.
    public static HashSet<Integer> cloneHashSet(HashSet<Integer> hashSet) {
        
        HashSet<Integer> clonedHashSet = new HashSet<>();
        Iterator<Integer> iterator = hashSet.iterator();
        
        for (int i = 0; i < hashSet.size(); i++) {
            clonedHashSet.add(iterator.next());
        }

        return clonedHashSet;
    }

    //7. Write a Java program to convert a hash set to an array.
    public static Object[] hashSetToArray(HashSet<Integer> hashSet) {
        
        Object[] array = hashSet.toArray(); 

        return array;
    }

    //8. Write a Java program to convert a hash set to a tree set.
    public static TreeSet<Integer> hashToTree(HashSet<Integer> hashSet) {

        TreeSet<Integer> treeSet = new TreeSet<>();
        Iterator<Integer> iterator = hashSet.iterator();

        while (iterator.hasNext()) {
            treeSet.add(iterator.next());
        }

        System.out.println(treeSet);
        return treeSet;
    }



}


