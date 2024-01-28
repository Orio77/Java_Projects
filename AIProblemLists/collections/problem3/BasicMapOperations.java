package collections.problem3;

import java.util.HashMap;
import java.util.Map;

public class BasicMapOperations {
    public static void main(String[] args) {
        
        Map<String, Integer> studentScores = new HashMap<>();
        studentScores.put("John", 85);
        studentScores.put("Emma", 90);
        studentScores.put("Sophia", 78);
        studentScores.put("Lucas", 92);
        studentScores.put("Olivia", 88);

        //Add and Remove operations
        studentScores.remove("John");
        studentScores.put("Elton", 100);

        //Check if key/value exists
        studentScores.containsKey("Elton");
        studentScores.containsValue(50);

        //Iteration over a Map

        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
