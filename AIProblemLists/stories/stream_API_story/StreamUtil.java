package stories.stream_API_story;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamUtil {
    

    public List<Person> filterbyAge(List<Person> people, int age) {
        
        return people.stream().filter(person -> person.getAge() >= age).collect(Collectors.toList());
    }

    public List<String> mapToNames(List<Person> people) {
        
        return people.stream().map(person -> person.getName()).collect(Collectors.toList());
    }

    public List<Person> sortByAge(List<Person> people) {
        
        return people.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());
    }

    public double calculateAverageAge(List<Person> people) {
        
        return people.stream().mapToInt(person -> person.getAge()).average().getAsDouble();
    }

    public Map<String, Long> groupByCity(List<Person> people) {
        return people.stream().collect(Collectors.groupingBy(Person::getCity, Collectors.counting()));
    }

    public int calculateTotalAge(List<Person> people) {
        
        return people.stream().mapToInt(person -> person.getAge()).sum();
    }

    public Person findFirstPersonWithAge(List<Person> people, int age) {

        return people.stream().filter(person -> person.getAge() == age).findFirst().orElse(null);
    }

    public int calculateTotalAgeParallel(List<Person> people) {

        return people.parallelStream().mapToInt(person -> person.getAge()).sum();
    }

    public Map<String, Double> groupByCityAndCalculateAverageAge(List<Person> people) {
        
        return people.stream().collect(Collectors.groupingBy(person -> person.getCity(), Collectors.averagingDouble(Person::getAge)));
    }

    public List<Person> filterByMultipleConditions(List<Person> people, Predicate<Person>... conditions) {

        Predicate<Person> allPredicates = Arrays.stream(conditions).reduce(x -> true, Predicate::and);

        return people.stream().filter(allPredicates).collect(Collectors.toList());
    }

    public Set<String> getDistinctCitiesOfPeopleWithMultipleHobbies(List<Person> people) {
    
        return people.stream().flatMap(person -> person.getHobbies().stream()).distinct().collect(Collectors.toSet());
    }


}
