## 1

```diff
- public Map<String, Long> groupByCity(List<Person> people) {
- 
-         return people.stream().collect(Collectors.toMap(person -> person.getName(), person -> person.getCity()));
-     }



+ public Map<String, Long> groupByCity(List<Person> people) {
+         return people.stream().collect(Collectors.groupingBy(Person::getCity, Collectors.counting()));
+     }

```

## 2

```diff
-    public Person findFirstPersonWithAge(List<Person> people, int age) {
-        
-        return people.stream().map(person -> person.getAge()).anyMatch(age);
-    }


+        public Person findFirstPersonWithAge(List<Person> people, int age) {
+
+        return people.stream().filter(person -> person.getAge() == age).findFirst().orElse(null);
+    }
```

## 3

flatMap()

##

```diff

```