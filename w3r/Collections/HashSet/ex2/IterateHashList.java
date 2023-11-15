package Collections.HashSet.ex2;

import java.util.HashSet;
import java.util.Iterator;

public class IterateHashList {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>();

        for (int i = 0; i < 20; i++) {
            myHashSet.add((int) (Math.random() * 10 * Math.random() * 10));
        }

        Iterator<Integer> iterator = myHashSet.iterator();
    
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
