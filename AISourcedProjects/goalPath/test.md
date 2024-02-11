**Problem: Wildcard Types in Java Generics**

In Java, the wildcard character (`?`) is used as a type parameter. Wildcards can be used in a variety of situations: as the type of a parameter, field, or local variable; sometimes they're even used as a return type.

Your task is to create a Java program that demonstrates the use of wildcard types in generics. The program should include the following functionalities:

1. **A generic `Box` class**: This class should be able to hold any type of object. It should have a single instance variable of a generic type (`T`), and a method `getContents()` that returns the object in the box. It should also have a method `setContents(T t)` that sets the object in the box.
    
2. **A `WildcardDemo` class**: This class should demonstrate the use of wildcard types. It should include the following methods:
    
    - `printBox(Box<?> box)`: This method should take a `Box` of unknown type and print its contents to the console.
        
    - `addAll(Box<? extends Collection<?>> box, Collection<?> c)`: This method should take a `Box` that contains a `Collection` of an unknown type, and a `Collection` of an unknown type. It should add all elements from the second collection to the first collection.
        

**Instructions:**

1. Create a `Box` class with the following methods:
    
    - `getContents()`: Returns the object in the box.
    - `setContents(T t)`: Sets the object in the box.
2. Create a `WildcardDemo` class with the following methods:
    
    - `printBox(Box<?> box)`: Takes a `Box` of unknown type and prints its contents to the console.
    - `addAll(Box<? extends Collection<?>> box, Collection<?> c)`: Takes a `Box` that contains a `Collection` of an unknown type, and a `Collection` of an unknown type. Adds all elements from the second collection to the first collection.
3. In your `main` method, create a `Box` of `ArrayList<String>`, add some elements to the `ArrayList`, and then use the `printBox` method to print the contents of the `Box`. Then, create another `ArrayList<String>`, add some elements to it, and use the `addAll` method to add all elements from the second `ArrayList` to the `ArrayList` in the `Box`. Finally, use the `printBox` method again to print the contents of the `Box`.
    

**Constraints:**

- The `Box` class should be able to hold any type of object.
- The `printBox` method should be able to handle a `Box` of any type.
- The `addAll` method should be able to handle a `Box` that contains a `Collection` of any type, and a `Collection` of any type.
- The `main` method should demonstrate the use of the `Box` class and the `WildcardDemo` class.


**Task 2: Stream Operations on Generic Box Collections**

In this task, you will expand upon the `Box` and `WildcardDemo` classes by integrating the concept of Generics in Streams. You will create a method that performs a stream operation on a collection of `Box` objects.

**Instructions:**

1. In the `WildcardDemo` class, add the following method:
    
    - `filterAndPrint(Box<? extends Collection<?>> box, Predicate<?> predicate)`: This method should take a `Box` that contains a `Collection` of an unknown type and a `Predicate` of an unknown type. It should filter the collection in the `Box` using the provided `Predicate`, and then print the filtered collection to the console.
2. In your `main` method, create a `Box` of `ArrayList<Integer>`, add some integers to the `ArrayList`, and then use the `filterAndPrint` method to filter the integers in the `Box` that are greater than 5 and print the filtered collection to the console.
    

**Constraints:**

- The `filterAndPrint` method should be able to handle a `Box` that contains a `Collection` of any type and a `Predicate` of any type.
- The `main` method should demonstrate the use of the `filterAndPrint` method.

**Note:** You will need to use a wildcard with a bounded type parameter (`? extends Number`) for the `Predicate` in the `filterAndPrint` method, since the `Predicate` needs to be able to handle any type that extends `Number`. This is because the `>` operator can only be used with numbers, not with any type.

**Task 3: Implementing a Generic Interface**

In this task, you will expand upon the `Box` and `WildcardDemo` classes by integrating the concept of Generic Interfaces and Classes. You will create a generic interface and a class that implements this interface.

**Instructions:**

1. Create a generic interface `Container<T>` with the following methods:
    
    - `addItem(T item)`: Adds an item to the container.
    - `removeItem(T item)`: Removes an item from the container.
    - `contains(T item)`: Checks if the container contains the specified item.
2. Modify the `Box` class to implement the `Container` interface. The `Box` class should now have the following additional methods:
    
    - `addItem(T item)`: Adds an item to the collection in the box.
    - `removeItem(T item)`: Removes an item from the collection in the box.
    - `contains(T item)`: Checks if the collection in the box contains the specified item.
3. In your `main` method, create a `Box` of `ArrayList<Integer>`, add some integers to the `ArrayList` using the `addItem` method, and then use the `filterAndPrint` method to filter the integers in the `Box` that are greater than 5 and print the filtered collection to the console. Then, use the `removeItem` method to remove an integer from the `ArrayList` in the `Box`, and the `contains` method to check if an integer is in the `ArrayList` in the `Box`.
    

**Constraints:**

- The `Container` interface should be able to handle any type of object.
- The `Box` class should implement all methods in the `Container` interface.
- The `main` method should demonstrate the use of the `addItem`, `removeItem`, and `contains` methods.

**Note:** You will need to modify the `Box` class to contain a `Collection` of `T` instead of a single object of type `T`. This is because the `addItem`, `removeItem`, and `contains` methods operate on a collection of items, not a single item.


### List of concepts:
[Understanding Generics, Parameterized Types, Wildcard Types, Type Erasure, Generic Methods, Bounded Type Parameters, Generics Best Practises, Generics in Collections, Type Casting and Type Checking, Generic Interfaces and Classes, Generics in Streams, Handling Generics Errors, Generics in Design Patterns, Performance Considerations, Testing Generics, Documentation]