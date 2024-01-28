package collections.problem11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Java
public class CollectionsReduction {
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

        //Basic solution
        int sum = 0;
        for (int i = 0; i < students.size(); i++) {
            sum = sum + students.get(i).getGrade();
        }
        System.out.println("Sum of the grades: " + sum);


        //Stream API solution
        int sum2 = students.stream()
                            .collect(Collectors.summingInt(student -> student.getGrade()));

        System.out.println("Streammed sum: " + sum2);
    }
}
