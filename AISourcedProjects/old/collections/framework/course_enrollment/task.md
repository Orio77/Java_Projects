# Exercise: University Course Registration System

## Overview:
Develop a Java program that simulates a basic university course registration system. This system should manage students, courses, and enrollments, leveraging various data structures for efficient data handling and retrieval.

## Specifics:
Define Classes - `Student`, `Course`, `Enrollment`:

- `Student`: Attributes include `studentId` (String), `name` (String).
- `Course`: Attributes include `courseId` (String), `courseName` (String), `maxCapacity` (int).
- `Enrollment`: Manages the relationship between `Student` and `Course`.

### Data Structures:

- Use a `HashMap` to store `Student` objects with `studentId` as the key.
- Use another `HashMap` for `Course` objects with `courseId` as the key.
- A `HashSet` to manage unique enrollments.
- A `LinkedList` or `PriorityQueue` for managing a waitlist for courses that reach maximum capacity.

### System Functionalities:

- Add/Remove Students/Courses: Ability to add and remove students and courses.
- Enroll/Unenroll in Courses: Handle enrollments, ensuring no over-capacity enrollments. If a course is full, place the student on a waitlist.
- Waitlist Management: Automatically enroll students from the waitlist when a spot becomes available.
- Display Information: Ability to list all students in a course, all courses a student is enrolled in, and view the waitlist for each course.

### Main Method:

Demonstrate various functionalities of the system, like adding students and courses, enrolling students, handling full courses and waitlists, and displaying relevant information.