package collections.problem2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BasicSetOperations {
    public static void main(String[] args) {
        
        //Set of scores
        Set<Integer> scores = new HashSet<>();
        scores.add(85);
        scores.add(90);
        scores.add(78);
        scores.add(92);
        scores.add(88);

        //Remove and add operations
        scores.remove(92);
        scores.add(100);

        //Check if an element exists operation
        System.out.println(scores.contains(56));

        //Iteration through the set
        Iterator<Integer> iterator = scores.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
}