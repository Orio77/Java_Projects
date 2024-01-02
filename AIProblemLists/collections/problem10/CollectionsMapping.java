package collections.problem10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Java
public class CollectionsMapping {
    // Student class
    static class Student {
        String name;
        int grade;

        // Constructor
        public Student(String name, int grade) {
            this.name = name;
            this.grade = grade;
        }

        // Getters
        public String getName() {
            return this.name;
        }

        public int getGrade() {
            return this.grade;
        }
    }

    public static void main(String[] args) {
        // Initialize the list of students
        List<Student> students = new ArrayList<>();
        // Add students to the list
        students.add(new Student("John", 90));
        students.add(new Student("Jane", 80));
        students.add(new Student("Bob", 88));
        students.add(new Student("Alice", 70));
        students.add(new Student("Charlie", 92));

        // TODO: Transform this list into a Map<String, Integer> where each key-value pair represents a student's name and their grade.

        Map<String, Integer> studentMap = students.stream()
                                                    .collect(Collectors.toMap(student -> student.getName(), student -> student.getGrade()));

        System.out.println(studentMap);
    }
}
