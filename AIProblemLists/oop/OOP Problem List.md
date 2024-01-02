# Object-Oriented Programming (OOP) in Java: Problem Statements

## 1. Class Basics and Encapsulation
**Problem Statement:** Design a simple `Book` class with private attributes (title, author, price) and public getter and setter methods. Implement a constructor to initialize these values.
**Objective:** Understand the principles of encapsulation and basic class structure.

## 2. Inheritance and Constructors
**Problem Statement:** Extend the `Book` class to create a `Textbook` class that includes additional attributes like subject and edition. Ensure the proper use of constructors with inheritance.
**Objective:** Grasp inheritance concepts and constructor chaining in Java.

## 3. Polymorphism and Method Overriding
**Problem Statement:** Implement a method in the `Textbook` class that overrides a method from the `Book` class, demonstrating polymorphism.
**Objective:** Understand method overriding and runtime polymorphism.

## 4. Abstract Classes and Methods
**Problem Statement:** Create an abstract class `Shape` with an abstract method `calculateArea()`. Define concrete classes like `Circle` and `Rectangle` that extend `Shape` and implement `calculateArea()`.
**Objective:** Learn about abstract classes, abstract methods, and their role in enforcing a contract in subclasses.

## 5. Interfaces and Multiple Inheritance
**Problem Statement:** Define an interface `Printable` with a `print()` method. Make the `Book` class implement this interface. Demonstrate how a class can implement multiple interfaces.
**Objective:** Understand interfaces and their role in implementing multiple inheritance in Java.

## 6. Aggregation over Inheritance
**Problem Statement:** Create a `Library` class that contains a list of `Books`, instead of extending from `Book`, to demonstrate aggregation.
**Objective:** Understand the concept of "aggregation over inheritance" and its advantages.

## 7. Encapsulation with Complex Types
**Problem Statement:** Enhance the `Book` class by adding a complex type attribute, like `Publisher`, which is a class with its own attributes.
**Objective:** Deepen understanding of encapsulation using complex types.

## 8. Nested and Inner Classes
**Problem Statement:** Inside the `Library` class, create a nested static class `LibraryCard` and a non-static inner class `Librarian`.
**Objective:** Explore nested and inner classes and their use cases.

## 9. Enum Types
**Problem Statement:** Define an enum `Genre` with values like FICTION, NONFICTION, SCIENCE, etc., and use it in the `Book` class.
**Objective:** Understand the use of enum types in Java.

## 10. Exception Handling in OOP
**Problem Statement:** Implement custom exception handling in the `Book` class, such as throwing an exception if a book's price is set to a negative value.
**Objective:** Learn to handle exceptions effectively within an object-oriented context.

## 11. Overloading Constructors and Methods
**Problem Statement:** Overload constructors and methods in the `Textbook` class to provide multiple ways of creating an object or performing an operation.
**Objective:** Master the concept of method and constructor overloading for flexibility in object creation and method usage.

## 12. Static Members and Methods
**Problem Statement:** Add static members and methods to the `Book` class, such as a static method to keep track of the total number of books created.
**Objective:** Understand the role of static members and methods in a class and their shared nature across instances.

## 13. Interface Default and Static Methods
**Problem Statement:** Enhance the `Printable` interface with default and static methods, exploring new features introduced in Java 8 for interfaces.
**Objective:** Get accustomed to Java 8 enhancements in interface design, including default and static methods.

## 14. Using 'this' and 'super' Keywords
**Problem Statement:** Utilize 'this' and 'super' keywords in the `Textbook` class for constructor chaining and method overriding.
**Objective:** Understand the importance of 'this' and 'super' in managing current and parent class members and constructors.

## 15. Implementing Comparable Interface
**Problem Statement:** Implement the `Comparable` interface in the `Book` class to compare books based on their titles or other attributes.
**Objective:** Learn how to enable sorting and comparison of custom objects.

## 16. Using Generics in Classes
**Problem Statement:** Modify the `Library` class to use Generics, allowing it to store a list of any type of books.
**Objective:** Understand the role and benefits of Generics in ensuring type safety and code reusability.

## 17. Advanced Polymorphism - Using Interfaces
**Problem Statement:** Create multiple interfaces and have the `Textbook` class implement these interfaces to demonstrate advanced polymorphism.
**Objective:** Show the power of polymorphism in Java through the use of multiple interfaces.

## 18. Design Patterns - Singleton
**Problem Statement:** Implement a Singleton pattern in a class, such as a `LibraryManager`, ensuring that only one instance of the class exists in the program.
**Objective:** Introduce basic design patterns starting with Singleton, understanding its use cases and implications.

## 19. Design Patterns - Factory Method
**Problem Statement:** Implement a Factory Method pattern to create objects of different subclasses of `Shape`.
**Objective:** Explore the Factory Method design pattern to understand object creation in a more modular approach.

## 20. Working with Collections in OOP
**Problem Statement:** Use Java Collections Framework in the `Library` class to manage a collection of `Books`.
**Objective:** Integrate collections into OOP, understanding their use in managing groups of objects effectively.

## 21. Dependency Injection
**Problem Statement:** Modify the `Library` class to accept a `BookSorter` through its constructor, demonstrating dependency injection.
**Objective:** Learn the concept of dependency injection and its importance in creating flexible and testable code.

## 22. Using Annotations
**Problem Statement:** Create custom annotations and apply them to the `Book` class, like an `@Author` annotation to specify the author's name.
**Objective:** Understand how to create and use annotations in Java for metadata and processing information.

## 23. Design Patterns - Observer Pattern
**Problem Statement:** Implement the Observer pattern where `Book` instances notify a `BookTracker` class when their state changes.
**Objective:** Explore the Observer design pattern to understand event handling and loose coupling between objects.

## 24. Advanced Interface Concepts - Functional Interfaces
**Problem Statement:** Define a functional interface and use it to implement lambda expressions in the context of book sorting or filtering.
**Objective:** Dive into functional interfaces and lambda expressions, a key feature in modern Java for concise and functional-style programming.

## 25. Multithreading with OOP
**Problem Statement:** Create a multi-threaded application where each thread processes a different `Book` instance, illustrating thread safety in OOP.
**Objective:** Understand the challenges and techniques of handling multithreading in an object-oriented environment.

## 26. Design Patterns - Builder Pattern
**Problem Statement:** Implement the Builder pattern in the `Book` class to allow the creation of book objects with optional parameters.
**Objective:** Learn the Builder pattern to understand how it helps in creating objects with multiple optional parameters in a readable manner.

## 27. Reflection API Usage
**Problem Statement:** Use Java's Reflection API to inspect the `Book` class at runtime, retrieving information about its fields, methods, and constructors.
**Objective:** Gain insights into Java's Reflection API, which allows runtime inspection and modification of classes.

## 28. Design Patterns - Strategy Pattern
**Problem Statement:** Implement the Strategy pattern in the `Library` class for different book sorting strategies.
**Objective:** Explore the Strategy design pattern to understand how it enables the selection of algorithms at runtime.

## 29. Working with Streams API
**Problem Statement:** Use Java's Streams API to perform operations like filtering and mapping on a collection of `Books`.
**Objective:** Get hands-on experience with the Streams API for functional-style operations on collections.

## 30. Design Patterns - Decorator Pattern
**Problem Statement:** Implement the Decorator pattern to add additional features to `Book` objects, like a `Borrowable` decorator that adds borrowing features.
**Objective:** Learn about the Decorator pattern and how it allows for dynamic addition of responsibilities to objects.

## 31. Advanced Exception Handling
**Problem Statement:** Implement a custom checked exception for the `Library` class and demonstrate proper handling and propagation of this exception.
**Objective:** Deepen understanding of exception handling, particularly the use of custom checked exceptions.

## 32. Design Patterns - Adapter Pattern
**Problem Statement:** Use the Adapter pattern to create compatibility between a `BookReader` interface and a legacy `BookScanner` class.
**Objective:** Understand the Adapter pattern and its use in making incompatible interfaces work together.

## 33. Java 8 Features in OOP - Streams and Lambda
**Problem Statement:** Incorporate Java 8 features like streams and lambda expressions in the `Library` class for enhanced data processing.
**Objective:** Apply Java 8 enhancements to OOP concepts, leveraging modern and functional programming techniques.

## 34. Interface Segregation Principle
**Problem Statement:** Refactor a large interface into smaller, more specific interfaces in the context of a book management system.
**Objective:** Understand and apply the Interface Segregation Principle, a key aspect of SOLID design principles.

## 35. Design Patterns - Composite Pattern
**Problem Statement:** Implement the Composite pattern to represent hierarchical structures of `Book` and `BookBundle` objects.
**Objective:** Explore the Composite pattern to understand how it simplifies client code when dealing with tree-like structures.

## 36. Liskov Substitution Principle
**Problem Statement:** Modify the inheritance hierarchy of `Book` and its subclasses to adhere to the Liskov Substitution Principle.
**Objective:** Apply the Liskov Substitution Principle to ensure that subclasses can replace their parent class without affecting program correctness.

## 37. Advanced Generics
**Problem Statement:** Implement advanced generic types in the `Library` system, such as bounded type parameters and wildcards.
**Objective:** Gain a deeper understanding of generics in Java, exploring their full capabilities and constraints.

## 38. Design Patterns - Proxy Pattern
**Problem Statement:** Implement the Proxy pattern to control access to `Book` objects, such as creating a `BookProxy` for access control.
**Objective:** Learn about the Proxy pattern and its application in controlling and managing access to objects.

## 39. Java Memory Model and Object Creation
**Problem Statement:** Explore the Java Memory Model in the context of object creation, referencing, and garbage collection in a simulated library system.
**Objective:** Gain a deeper understanding of how Java manages memory in object-oriented programming, including garbage collection.

## 40. Open/Closed Principle
**Problem Statement:** Refactor the `Library` system to make it open for extension but closed for modification, adhering to the Open/Closed Principle.
**Objective:** Apply the Open/Closed Principle to ensure that the system is extendable without modifying existing code.

## 41. Dependency Inversion Principle
**Problem Statement:** Refactor the `Library` system to follow the Dependency Inversion Principle, where high-level modules do not depend directly on low-level modules.
**Objective:** Learn and apply the Dependency Inversion Principle to promote a decoupled and more maintainable code structure.

## 42. Design Patterns - Command Pattern
**Problem Statement:** Implement the Command pattern in a book management application, allowing operations like adding or removing books to be encapsulated as command objects.
**Objective:** Understand the Command pattern and its use in encapsulating operations as objects for flexibility and extensibility.

## 43. Design Patterns - State Pattern
**Problem Statement:** Apply the State pattern to the `Book` class to manage its different states (e.g., Available, Borrowed, Reserved).
**Objective:** Explore the State pattern to efficiently handle an object's state transitions and associated behaviors.

## 44. Advanced Polymorphism - Covariant Return Types
**Problem Statement:** Implement covariant return types in an inheritance hierarchy involving a `Book` and its subclasses.
**Objective:** Understand the use of covariant return types in polymorphism, allowing overridden methods to return more specific types.

## 45. Design Patterns - Chain of Responsibility
**Problem Statement:** Use the Chain of Responsibility pattern in a logging mechanism for the `Library` system, where log messages pass through a chain of handlers.
**Objective:** Learn the Chain of Responsibility pattern and its application in creating a chain of processing objects.

## 46. Java Reflection for Dynamic Code
**Problem Statement:** Use Java Reflection to dynamically create instances of `Book` subclasses and invoke methods based on external configuration.
**Objective:** Delve into the capabilities of Java Reflection for dynamic code creation and invocation, understanding its power and limitations.

## 47. Design Patterns - Flyweight Pattern
**Problem Statement:** Implement the Flyweight pattern to manage shared `Book` objects efficiently in memory, such as sharing common data across instances.
**Objective:** Explore the Flyweight pattern and its role in memory optimization by sharing common parts of object state.

## 48. Design Patterns - Visitor Pattern
**Problem Statement:** Apply the Visitor pattern to perform operations on `Book` objects without changing their classes, like a `BookMetadataExtractor`.
**Objective:** Understand the Visitor pattern and its usefulness in adding new operations to classes without modifying them.

## 49. Advanced Interface Concepts - Predicate and Consumer
**Problem Statement:** Use Java functional interfaces like `Predicate` and `Consumer` in the context of a `BookFilter` and `BookProcessor`.
**Objective:** Get hands-on experience with functional interfaces and their application in functional programming paradigms.

## 50. Design Patterns - Mediator Pattern
**Problem Statement:** Implement the Mediator pattern in a book borrowing system, facilitating communication between different components like `Borrower`, `Lender`, and `Book`.
**Objective:** Learn about the Mediator pattern and its use in reducing direct communication between objects, promoting loose coupling.