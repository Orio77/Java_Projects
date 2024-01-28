package java_8_streams_api.problem7;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

class Course {
    private String name;

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Student {
    private String name;
    private int grade;
    private List<Course> courses;

    public Student(String name, int grade, List<Course> courses) {
        this.name = name;
        this.grade = grade;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

public class Problem7IntermediateOperations {
    public static void main(String[] args) {
        // Initialize some courses
        Course csCourse = new Course("Computer Science");
        Course mathCourse = new Course("Mathematics");

        // Initialize some students
        Student student1 = new Student("Alice", 90, Arrays.asList(csCourse, mathCourse));
        Student student2 = new Student("Bob", 80, Arrays.asList(csCourse));
        Student student3 = new Student("Charlie", 88, Arrays.asList(mathCourse));
        Student student4 = new Student("Diana", 92, Arrays.asList(csCourse, mathCourse));

        // Initialize a list of students
        List<Student> students = Arrays.asList(student1, student2, student3, student4);

        // TODO: Use intermediate operations to transform this list into a List<String> containing the names of students 
        // who are studying "Computer Science" and have a grade above 85, sorted alphabetically.

        List<Student> topStundets = students.stream()
                                            .filter(s -> s.getCourses().stream().anyMatch(c -> "Computer Science".equals(c.getName())))
                                            .filter(s -> s.getGrade() > 85)
                                            .collect(Collectors.toList());

        System.out.println(topStundets);
    }
}