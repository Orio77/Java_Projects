## Problem 1: Sequential Number Stream

Task: Generate a stream of the first 15 sequential numbers, then filter out the odd numbers and sum the remaining even numbers.

Concepts to Practice: Basic stream generation, filtering with `filter`, and summarization with `sum`.

Objective: Reinforce understanding of stream filtering and basic summarizing operations.

---

## Problem 2: Square Root Stream

Task: Create a stream of the first 10 integers, compute their square roots, and then find the average.

Concepts to Practice: Stream transformation using `map`, use of `Math.sqrt` within a stream, and calculating the average.

Objective: Help the student get comfortable with transforming stream elements and applying aggregate functions.

---

## Problem 3: Stream of Square Roots of Odd Numbers

Task: Generate a stream of the first 20 natural numbers. Filter this stream to include only odd numbers. Then, calculate the square root of each odd number and sum these square roots. Print the final sum.

Goals:

- Stream Generation: Practice creating a stream of a specific range of numbers.
- Filtering: Use the `filter` method to select only odd numbers.
- Transformation: Apply the `mapToDouble` method to transform each number to its square root.
- Summarization: Sum the transformed numbers using `sum`.

Expected Concepts to Practice: `IntStream.range`, `filter`, `mapToDouble`, `sum`.

---

## Problem 4: Stream of Factorials

Task: Generate a stream of the first 10 factorial numbers (i.e., 1!, 2!, 3!, ..., 10!). Then, filter out factorials that are over 1000 and calculate the average of the remaining factorials. Print the average.

Goals:

- Stream Generation with Iteration: Use `Stream.iterate` to generate factorials.
- Filtering and Conditional Logic: Filter out factorials greater than 1000.
- Calculating Average: Use `average` to find the average of the remaining factorials.
