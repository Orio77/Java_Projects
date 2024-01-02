Problem 10: Stream Filtering and Transformation
Problem Statement: Write a Java program that processes a list of books. Each book has a title, author, and a boolean flag indicating if it's a science fiction genre. Your task is to use Java streams to create a list of titles of all science fiction books written by a specific author, sorted alphabetically.

Requirements:

Define a Book class with attributes for the title, author, and a boolean flag for science fiction genre.
Initialize a list of Book objects with various titles, authors, and genre flags.
Choose an author.
Use Java streams to filter the books by the specified author and the science fiction genre.
Transform the stream to a list of book titles and sort them alphabetically.
Print the resulting list of titles to the console.
This problem will help reinforce your understanding of filtering based on multiple criteria, transforming objects within a stream, and sorting the results.

Problem 11: Advanced Usage of Streams with Aggregation
Problem Statement: Create a Java program that analyzes a list of students, where each student has a name, a list of grades, and a list of enrolled courses. Use Java streams to find the average grade of students who are enrolled in a specific course.

Requirements:

Define a Student class with a name, a list of integer grades, and a list of courses (strings).
Initialize a list of Student objects.
Choose a course.
Use Java streams to filter students who are enrolled in the specified course.
Calculate the average grade of these students. Consider the case where a student might not have any grades yet.
Print the average grade to the console. If there are no students in the course or no grades available, handle these cases gracefully in your output.