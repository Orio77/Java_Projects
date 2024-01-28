package collections.problem8;

import java.util.ArrayList;
import java.util.List;

public class CollectionsSearchingProblem {

    // Class to represent a Student
    static class Student implements Comparable<Student>{
        String name;

        // Constructor
        public Student(String name) {
            this.name = name;
        }

        // Getter for name
        public String getName() {
            return name;
        }

        @Override
        public int compareTo(Student otherStudent) {
            return this.name.compareTo(otherStudent.name);
        }
    }


    static class SearchTools {

        //For Short lists
        public void searchUnsorted(String name, List<Student> studentList) {
            for (Student student : studentList) {
                if (student.getName().equals(name)) {
                    System.out.println(name + "was found on the list");
                    return;
                }
            }
            System.out.println("No such student on the list");
        }

        public String searchSorted(String name, List<Student> studentList) {

            int lowerBound = 0;
            int upperBound = studentList.size();
            
            while (lowerBound <= upperBound) {
                int mid = (lowerBound + upperBound) / 2;
                int result = name.compareTo(studentList.get(mid).getName());

                if (result == 0) {
                    return "Student " + studentList.get(mid).getName() + " found on the list";
                }
                else if (result > 0) {
                    lowerBound = mid + 1;
                }
                else
                    upperBound = mid - 1;
            }

            return "No such student on the list";
        }

    public static void main(String[] args) {
        // Initialize a list of students
        List<Student> students = new ArrayList<>();

        // Add students to the list
        students.add(new Student("Alice"));
        students.add(new Student("Bob"));
        students.add(new Student("Charlie"));
        students.add(new Student("David"));
        students.add(new Student("Emily"));
        students.add(new Student("Frank"));
        students.add(new Student("Grace"));
        students.add(new Student("Henry"));
        students.add(new Student("Isabella"));
        students.add(new Student("Jack"));
        students.add(new Student("Katherine"));
        students.add(new Student("Liam"));
        students.add(new Student("Mia"));
        students.add(new Student("Noah"));
        students.add(new Student("Olivia"));
        students.add(new Student("Patrick"));
        students.add(new Student("Quinn"));
        students.add(new Student("Ryan"));
        students.add(new Student("Sophia"));
        students.add(new Student("Thomas"));
        students.add(new Student("Ursula"));
        students.add(new Student("Victoria"));
        students.add(new Student("William"));
        // ... add more students as needed

        // TODO: Implement search for a student by name in this list
        SearchTools tool = new SearchTools();

        // TODO: Demonstrate how to search in a sorted and unsorted list

        System.out.println(tool.searchSorted("Victoria", students));

        }
    }
}
