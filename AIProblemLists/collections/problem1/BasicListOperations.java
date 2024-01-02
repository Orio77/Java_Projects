package collections.problem1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BasicListOperations {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("John");
        students.add("Emma");
        students.add("Sophia");
        students.add("Lucas");
        students.add("Olivia");

        students.remove(0);
        students.add("Francis");

        Iterator<String> iterator = students.iterator();
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
