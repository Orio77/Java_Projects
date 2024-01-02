package collections.problem9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Java
public class CollectionsFiltering {
    // Student class
    static class Student {
        int grade;

        // Constructor
        public Student(int grade) {
            this.grade = grade;
        }

        // Getter
        public int getGrade() {
            return this.grade;
        }
    }

    public static void main(String[] args) {
        // Initialize the list of students
        List<Student> students = new ArrayList<>();
        // Add students to the list
        students.add(new Student(90));
        students.add(new Student(80));
        students.add(new Student(88));
        students.add(new Student(70));
        students.add(new Student(92));
        // TODO: Filter the list to get students with grade above 85

        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getGrade() <= 85)
                iterator.remove();
        }
    }
}
