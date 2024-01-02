Problem 12: Stream Filtering and Aggregation
Problem Statement: Write a Java program to process a list of messages. Each message has a sender, recipient, and content. Your task is to use Java streams to find the count of messages sent by a specific sender that contain a given keyword in their content.

Requirements:

Define a Message class with attributes for the sender, recipient, and content.
Initialize a list of Message objects.
Choose a sender and a keyword.
Use Java streams to filter messages based on the sender and keyword presence in the content.
Count these filtered messages and print the count to the console.
This problem will reinforce your ability to use filtering and aggregation (counting) in streams, focusing on string manipulation and conditional checks within the stream pipeline.

Problem 13: Stream Transformation and Advanced Filtering
Problem Statement: Imagine you have a stream of Post objects, where each Post has a title, content, and a list of tags (strings). Write a Java program that filters posts containing specific tags and then transforms this stream into a list of strings representing the titles of these posts, sorted alphabetically.

Requirements:

Define a Post class with title, content, and a list of tags.
Initialize a stream of Post objects.
Choose a set of tags to filter by.
Use Java streams to filter posts that contain any of the chosen tags.
Transform the filtered stream into a list of post titles.
Sort these titles alphabetically and collect them into a list.
Print the sorted list of titles to the console.
This problem will help you practice more complex filtering logic (checking if a collection contains any elements of another collection) and how to combine filtering, mapping, and sorting operations in a stream.