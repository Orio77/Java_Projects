package collections.problem17.additional_problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AdvancedSortingWithComparator {
    // Define a Person class with age and name attributes.
    static class Person {
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

        // Write separate Comparator implementations: one for sorting by age and another for sorting by name.
        people.sort(Comparator.comparing(Person::getName));
        System.out.println(people);
        people.sort(Comparator.comparing(Person::getAge));
        System.out.println(people);
    }
}
