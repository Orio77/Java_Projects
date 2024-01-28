# Exercise: Implementing a Custom Sort Comparator

## Task Overview:
Create a Java program to sort a list of custom objects using a Comparator. The goal is to deepen your understanding of sorting mechanisms in Java, especially when dealing with complex data types.

## Specifics:
Define a Class `Book`:
- Attributes: `title` (String), `author` (String), `yearOfPublication` (int).
- Constructor and appropriate getters/setters.

### Create and Populate an ArrayList:
- Instantiate an ArrayList of `Book` objects.
- Add at least seven books to the ArrayList with varying titles, authors, and years.

### Implement Custom Sorting:
- Write a method to sort the books by their `yearOfPublication` in descending order.
- Use a custom Comparator implemented as an anonymous class or a lambda expression.

## Bonus Challenge:
Implement additional sorting methods:
- Sort by `title` in alphabetical order.
- Sort by `author` name, and in case of a tie, by `yearOfPublication` (ascending).

## Display the Sorted Lists:
- Print the sorted lists to the console to verify the sorting order.