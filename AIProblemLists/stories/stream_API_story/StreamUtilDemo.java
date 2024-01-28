package stories.stream_API_story;

import java.util.Arrays;
import java.util.List;

public class StreamUtilDemo {
    public static void main(String[] args) {
            List<Person> people = Arrays.asList(
            new Person("John", 30, "New York"),
            new Person("Amy", 20, "Los Angeles"),
            new Person("Zack", 25, "Chicago"),
            new Person("Mia", 35, "Houston"),
            new Person("Robert", 40, "Phoenix"),
            new Person("Sophia", 28, "Philadelphia"),
            new Person("Ben", 33, "San Antonio"),
            new Person("Emma", 22, "San Diego"),
            new Person("Lucas", 29, "Dallas"),
            new Person("Olivia", 31, "San Jose"),
            new Person("Ethan", 36, "Austin"),
            new Person("Ava", 27, "Jacksonville"),
            new Person("Mason", 32, "San Francisco"),
            new Person("Isabella", 24, "Indianapolis"),
            new Person("Logan", 34, "Columbus"),
            new Person("Mia", 23, "Fort Worth"),
            new Person("Noah", 39, "Charlotte"),
            new Person("Harper", 21, "Detroit"),
            new Person("Liam", 38, "El Paso"),
            new Person("Ella", 26, "Seattle")
        );

        StreamUtil tools = new StreamUtil();

        List<Person> peopleSortedByAge = tools.sortByAge(people);
        System.out.println(peopleSortedByAge);

    }
}
