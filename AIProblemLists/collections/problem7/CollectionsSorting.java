package collections.problem7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CollectionsSorting {

    public static void main(String[] args) {
        class Student {
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
        public String toString() {
            return name + ": " + grade;
        }

        }

        List<Student> students = new ArrayList<>();
        students.add(new Student("Tohn", 85));
        students.add(new Student("Emma", 90));
        students.add(new Student("Sophia", 85));
        students.add(new Student("Lucas", 92));
        students.add(new Student("Olivia", 88));

        

        // Section for sorting the list in ascending order
        students.sort(Comparator.comparingInt(Student::getGrade));
        System.out.println("Ascending order: " + students);

        // Section for sorting the list in descending order
        students.sort(Comparator.comparingInt(Student::getGrade).reversed());
        System.out.println("Descending order: " + students);

        // Section for sorting by multiple fields
        students.sort(Comparator.comparingInt(Student::getGrade)
                                .thenComparing(Student::getName));
        System.out.println("Sorted by grade, then name: " + students);
    }
}
