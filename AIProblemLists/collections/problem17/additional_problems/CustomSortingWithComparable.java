package collections.problem17.additional_problems;

import java.util.Arrays;
import java.util.List;

// Java code

// Problem 1: Implementing Custom Sorting with Comparable

public class CustomSortingWithComparable {
    // Define a Person class with age and name attributes.
    static class Person implements Comparable<Person>{
        int age;
        String name;

        // Constructor
        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        // Getters
        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        @Override
        public int compareTo(Person person) {
           return this.name.compareTo(person.getName());
        }

        @Override
        public String toString() {
            return this.name;
        }
    }

    public static void main(String[] args) {
        // Initialize a List of Person objects with various ages and names.
        List<Person> people = Arrays.asList(
            new Person(30, "John"),
            new Person(20, "Amy"),
            new Person(25, "Zack"),
            new Person(30, "Amy"),
            new Person(20, "John")
        );

        // Implement the Comparable interface to sort Person objects first by age, then by name.
        System.out.println(people.get(0).compareTo(people.get(3)));
        // Test your implementation by sorting the list of Person objects.
        System.out.println(people);
        // Print the sorted list to the console.
    }
}
