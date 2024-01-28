Java Problem 1: Implement a Basic Stack
Objective: Implement a basic Stack class in Java.

Description:

Define a Stack class that uses an array to store elements.
Implement the following methods:
void push(int element): Adds an element to the top of the stack.
int pop(): Removes and returns the element from the top of the stack. If the stack is empty, return -1 or throw an exception.
int peek(): Returns the element at the top of the stack without removing it. If the stack is empty, return -1 or throw an exception.
boolean isEmpty(): Returns true if the stack is empty, otherwise false.
Handle the scenario when the stack gets full (consider a fixed size for simplicity).


Constraints:
The stack should only hold integer values.
Assume the stack size is fixed (e.g., 10 elements).


Example Usage:

Stack stack = new Stack();
stack.push(5);
stack.push(10);
System.out.println(stack.peek()); // Should output 10
System.out.println(stack.pop()); // Should output 10
System.out.println(stack.isEmpty()); // Should output false