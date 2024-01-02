package collections.problem17;

import java.util.*;

public class Problem17UnderstandingComparableAndComparator {
    // Create a Student class with name and grade properties
    public static class Student implements Comparable<Student>{
        String name;
        int grade;

        public Student(String name, int grade) {
            this.name = name;
            this.grade = grade;
        }

        public int getGrade() {
            return grade;
        }

        public String getName() {
            return name;
        }

        @Override
        public int compareTo(Student student) {
            if (this.grade > student.getGrade())
                return 1;
            else if (this.grade == student.getGrade())
                return 0;
            else
                return -1;
        }   

        @Override
        public String toString() {
            return this.name;
        }

    }

    public static void main(String[] args) {
        // Initialize a List of Student objects
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 90));
        students.add(new Student("Bob", 85));
        students.add(new Student("Charlie", 95));

        // TODO: Implement Comparable in Student class to sort by grade

        Collections.sort(students);
        System.out.println(students);

        // TODO: Use a Comparator to sort the list by name

        Comparator<Student> nameComparator = Comparator.comparing(Student::getName);

        Collections.sort(students, nameComparator);
        System.out.println(students);
    }
}
