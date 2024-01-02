## Problem 1: Reading a Text File
**Problem Statement:** Write a Java program that reads a text file and prints its content to the console.

**Requirements:**
- Create a text file with some content.
- Use a `FileReader` to read this file.
- Print the content of the file to the console.







## Additional Problem 1*: Writing to a Text File
**Problem Statement:** Write a Java program that writes a list of strings to a text file.

**Requirements:**
- Create a list of strings in your program.
- Use a `FileWriter` and `BufferedWriter` to write the strings to a new text file.
- Handle any potential `IOException` that might occur.
- Ensure that the `BufferedWriter` is closed properly, even if an exception is thrown.

## Additional Problem 2*: Reading and Writing Binary Files
**Problem Statement:** Create a Java program that reads a binary file and writes its contents to a new binary file.

**Requirements:**
- Use `FileInputStream` and `FileOutputStream` to handle the binary data.
- Handle any potential `FileNotFoundException` or `IOException` that might occur.
- Ensure that both the input and output streams are closed properly, even if an exception is thrown.