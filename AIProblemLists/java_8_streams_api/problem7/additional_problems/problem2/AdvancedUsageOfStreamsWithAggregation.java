package java_8_streams_api.problem7.additional_problems.problem2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

// Java code

// Problem 11: Advanced Usage of Streams with Aggregation

public class AdvancedUsageOfStreamsWithAggregation {
    // Define a Student class with attributes for the name, a list of integer grades, and a list of courses.
    static class Student {
        String name;
        List<Integer> grades;
        List<String> courses;

        // Constructor
        public Student(String name, List<Integer> grades, List<String> courses) {
            this.name = name;
            this.grades = grades;
            this.courses = courses;
        }

        // Getters
        public String getName() {
            return name;
        }

        public List<Integer> getGrades() {
            return grades;
        }

        public List<String> getCourses() {
            return courses;
        }
    }

    public static void main(String[] args) {
        // Initialize a list of Student objects with various names, grades, and courses.
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", Arrays.asList(85, 90, 95), Arrays.asList("Math", "Science", "English")));
        students.add(new Student("Bob", Arrays.asList(70, 80, 90), Arrays.asList("Math", "Art", "History")));
        students.add(new Student("Charlie", new ArrayList<>(), Arrays.asList("Science", "History")));
        students.add(new Student("David", Arrays.asList(100, 90, 80), Arrays.asList("Math", "Science", "English", "Art")));
        students.add(new Student("Eve", Arrays.asList(95, 85, 75), Arrays.asList("English", "Art", "History")));
        students.add(new Student("Frank", Arrays.asList(80, 70, 60), Arrays.asList("Math", "Science", "History")));
        students.add(new Student("Grace", new ArrayList<>(), Arrays.asList("Science", "English")));
        students.add(new Student("Hank", Arrays.asList(90, 80, 70), Arrays.asList("Math", "Science", "English", "Art")));
        // Choose a course.
        String chosenCourse = "Math";
        // Use Java streams to filter students who are enrolled in the specified course.
        List<Student> mathStudents = students.stream().filter(s -> s.getCourses().stream().anyMatch(c -> c.equals(chosenCourse))).collect(Collectors.toList());
        // Calculate the average grade of these students. Consider the case where a student might not have any grades yet.
        List<OptionalDouble> avgList = mathStudents.stream().map(s -> s.getGrades().stream().mapToInt(Integer::intValue).average()).collect(Collectors.toList());
        // Print the average grade to the console. If there are no students in the course or no grades available, handle these cases gracefully in your output.
        System.out.println(avgList);
    }
}
