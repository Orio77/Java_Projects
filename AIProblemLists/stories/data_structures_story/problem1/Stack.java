package stories.data_structures_story.problem1;

import java.util.Arrays;

public class Stack {
    private int[] array = new int[1];

    //adds element on top of the stack
    public void push(int number) {

        int[] newArray = new int[array.length + 1];
        newArray[newArray.length - 1] = number;
        this.array = newArray;
    }

    //return the element from the top of the stack
    public int peek() {
        if (array.length != 0)
            return array[array.length - 1];
        else
            return -1;
    }


    //removes the element from the top of the stack
    public int pop() {

        if (array.length == 0)
            return -1;

        int element = array[array.length - 1];
        int[] newArray = new int[array.length - 1];
        
        try {
            newArray = Arrays.stream(array).toArray();
        }
        catch (IndexOutOfBoundsException e) {
        }

        return element;
    }

    public boolean isEmpty() {
        if (array.length == 0)
            return true;
        else 
            return false;
    }

}

/* 
Student's Skill Assessment:
The student demonstrates a rudimentary grasp of Java and basic data structures, 
but there's a considerable gap in understanding efficient and effective coding practices. 
The approach to the stack implementation lacks sophistication, suggesting a surface-level engagement with the concepts. 
There's a notable deficiency in foreseeing the implications of code decisions, 
particularly in terms of performance and error handling. 
This points to a need for a stronger foundation in computer science fundamentals and a more analytical mindset towards problem-solving. 
Encouraging the student to delve deeper into algorithmic efficiency, data structure optimization, and robust error handling is crucial. 
It's important to challenge the student to think critically about code design and to consider the broader impact of their coding choices. 
This will be key in transitioning from a novice approach to a more mature, professional level of programming. 
*/

