# Task Overview:
Create a Java program that simulates a basic task management system using both ArrayList and LinkedList. This exercise will test your ability to understand and apply the strengths of each type of list.

## Specifics:
Define Two Classes - `Task` and `TaskManager`:

- `Task`: Represents a task with attributes `id` (int), `description` (String), and `priority` (int).
- `TaskManager`: Manages tasks using an ArrayList for storing tasks and a LinkedList for managing a queue of tasks based on priority.

### TaskManager Functionalities:

- Add Task: Adds a new task to the system (stored in an ArrayList).
- Queue Task: Based on priority, add tasks to a LinkedList (high-priority tasks should be processed first).
- Complete Task: Remove a task from the LinkedList once completed and update the ArrayList accordingly.
- List Tasks: Display all tasks (from ArrayList) and the current queue (from LinkedList).

### Priority Management:

- Implement a mechanism to handle task priority when queuing tasks. Ensure high-priority tasks are at the front of the LinkedList.

### Main Method:

- Demonstrate the addition, queueing, completion, and listing of tasks.

## Guidelines:
- Pay attention to the usage of both ArrayList and LinkedList and their respective strengths.
- Ensure the code is clean, well-structured, and well-commented.
- Handle edge cases, like trying to complete a task that doesn't exist.