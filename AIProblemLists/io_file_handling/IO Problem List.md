# Java I/O Stream Operations

## Problem 1: Reading a Text File
**Problem Statement:** Write a Java program that reads a text file and prints its content to the console.

**Requirements:**
- Create a text file with some content.
- Use a `FileReader` to read this file.
- Print the content of the file to the console.

## Problem 2: Writing to a Text File
**Problem Statement:** Write a Java program that writes a list of strings into a text file.

**Requirements:**
- Create a list of strings.
- Use a `FileWriter` to write these strings to a text file.
- Each string should be on a new line in the file.

## Problem 3: Copying a File
**Problem Statement:** Write a Java program that copies a file to another location.

**Requirements:**
- Create a source file with some content.
- Use `FileInputStream` and `FileOutputStream` to copy the content of the source file to a destination file.
- Verify the content of the destination file is the same as the source file.

## Problem 4: Reading a Binary File
**Problem Statement:** Write a Java program that reads a binary file and prints its content in hexadecimal format.

**Requirements:**
- Create a binary file with some content.
- Use `FileInputStream` to read this file.
- Print the content of the file to the console in hexadecimal format.

## Problem 5: Writing to a Binary File
**Problem Statement:** Write a Java program that writes an array of bytes into a binary file.

**Requirements:**
- Create an array of bytes.
- Use `FileOutputStream` to write these bytes to a binary file.
- Verify the content of the binary file.

## Problem 6: Understanding Character Encoding
**Problem Statement:** Write a Java program that reads a text file with a specific character encoding (like UTF-8 or ISO-8859-1).

**Requirements:**
- Create a text file with some content in a specific character encoding.
- Use `InputStreamReader` to read this file with the correct character encoding.
- Print the content of the file to the console.

## Problem 7: Buffered Reading
**Problem Statement:** Write a Java program that reads a large text file using a buffered stream and measures the time taken to read the file.

**Requirements:**
- Create a large text file with some content.
- Use `BufferedReader` to read this file.
- Measure the time taken to read the file and print it to the console.

## Problem 8: Buffered Writing
**Problem Statement:** Write a Java program that writes a large number of strings into a text file using a buffered stream and measures the time taken to write the file.

**Requirements:**
- Create a large number of strings.
- Use `BufferedWriter` to write these strings to a text file.
- Measure the time taken to write the file and print it to the console.

## Problem 9: Reading and Writing Objects
**Problem Statement:** Write a Java program that writes objects to a file and reads them back.

**Requirements:**
- Create a class with some fields.
- Create objects of this class and write them to a file using `ObjectOutputStream`.
- Read the objects back from the file using `ObjectInputStream` and print them to the console.

## Problem 10: Handling I/O Errors
**Problem Statement:** Write a Java program that handles I/O errors gracefully while reading or writing a file.

**Requirements:**
- Try to read a file that does not exist and handle the `FileNotFoundException` that is thrown.
- Try to write to a file that is read-only and handle the `IOException` that is thrown.

## Problem 11: Reading a File Line by Line
**Problem Statement:** Write a Java program that reads a text file line by line and prints each line to the console.

**Requirements:**
- Create a text file with multiple lines of text.
- Use `BufferedReader` to read this file line by line.
- Print each line to the console.

## Problem 12: Reading a File Word by Word
**Problem Statement:** Write a Java program that reads a text file word by word and prints each word to the console.

**Requirements:**
- Create a text file with multiple lines of text.
- Use `Scanner` or `BufferedReader` along with `StringTokenizer` to read this file word by word.
- Print each word to the console.

## Problem 13: Reading a File Character by Character
**Problem Statement:** Write a Java program that reads a text file character by character and prints each character to the console.

**Requirements:**
- Create a text file with some text.
- Use `FileReader` to read this file character by character.
- Print each character to the console.

## Problem 14: Using FileChannel for File Copy
**Problem Statement:** Write a Java program that copies a file to another location using `FileChannel`.

**Requirements:**
- Create a source file with some content.
- Use `FileChannel` to copy the content of the source file to a destination file.
- Verify the content of the destination file is the same as the source file.

## Problem 15: Reading and Writing with RandomAccessFile
**Problem Statement:** Write a Java program that writes data to specific positions in a file using `RandomAccessFile`.

**Requirements:**
- Create a `RandomAccessFile` and write some data at different positions in the file.
- Read the data back from the file and print it to the console.

## Problem 16: Using PipedInputStream and PipedOutputStream
**Problem Statement:** Write a Java program that uses `PipedInputStream` and `PipedOutputStream` to communicate between two threads.

**Requirements:**
- Create two threads.
- One thread writes data to a `PipedOutputStream`.
- The other thread reads data from a `PipedInputStream` connected to the `PipedOutputStream`.

## Problem 17: Compressing and Decompressing Data
**Problem Statement:** Write a Java program that compresses and decompresses data using `GZIPOutputStream` and `GZIPInputStream`.

**Requirements:**
- Write some data to a file using `GZIPOutputStream`.
- Read the compressed data back from the file using `GZIPInputStream` and print it to the console.

## Problem 18: Using SequenceInputStream
**Problem Statement:** Write a Java program that concatenates the content of multiple files into one file using `SequenceInputStream`.

**Requirements:**
- Create multiple source files with some content.
- Use `SequenceInputStream` to concatenate the content of these files into a destination file.
- Verify the content of the destination file.

## Problem 19: Using DataInputStream and DataOutputStream
**Problem Statement:** Write a Java program that writes primitive data types to a file using `DataOutputStream` and reads them back using `DataInputStream`.

**Requirements:**
- Write some primitive data (like int, float, boolean) to a file using `DataOutputStream`.
- Read the data back from the file using `DataInputStream` and print it to the console.

## Problem 20: Using PrintStream
**Problem Statement:** Write a Java program that writes formatted strings to a file using `PrintStream`.

**Requirements:**
- Write some formatted strings (like "Hello, %s", "The value is %d") to a file using `PrintStream`.
- Read the data back from the file and print it to the console.

## Problem 21: Using PushbackInputStream
**Problem Statement:** Write a Java program that uses `PushbackInputStream` to "unread" bytes back to the stream.

**Requirements:**
- Read some bytes from a file using `PushbackInputStream`.
- "Unread" some bytes back to the stream.
- Read the bytes again and print them to the console.

## Problem 22: Using StreamTokenizer
**Problem Statement:** Write a Java program that uses `StreamTokenizer` to break a text file into tokens.

**Requirements:**
- Create a text file with some text.
- Use `StreamTokenizer` to break the text into tokens.
- Print each token to the console.

## Problem 23: Using Console for Password Input
**Problem Statement:** Write a Java program that uses `Console` to read a password input from the user without echoing the input.

**Requirements:**
- Use `Console` to read a password input from the user.
- Print a message to the console after successfully reading the password.

## Problem 24: Using Files Utility Class
**Problem Statement:** Write a Java program that uses the `Files` utility class for file operations.

**Requirements:**
- Use `Files` class to create, read, write, and delete a file.
- Use `Files` class to read all lines from a file into a list of strings.
- Use `Files` class to write a list of strings to a file.

## Problem 25: Using Paths and Path
**Problem Statement:** Write a Java program that uses `Paths` and `Path` for file path operations.

**Requirements:**
- Use `Paths` to create a `Path` object.
- Use `Path` methods to retrieve information about the path, such as its file name, parent directory, root directory, and absolute path.

## Problem 26: Using FileVisitor to Traverse a Directory Tree
**Problem Statement:** Write a Java program that uses `FileVisitor` to traverse a directory tree.

**Requirements:**
- Create a directory tree with several directories and files.
- Use `Files.walkFileTree` method with a `FileVisitor` to traverse the directory tree and print the names of all files and directories.

## Problem 27: Using WatchService to Monitor Directory Changes
**Problem Statement:** Write a Java program that uses `WatchService` to monitor changes in a directory.

**Requirements:**
- Create a directory.
- Use `WatchService` to monitor the directory for changes (like file creation, deletion, or modification).
- Print a message to the console whenever a change is detected.

## Problem 28: Using FileStore to Get Disk Space Information
**Problem Statement:** Write a Java program that uses `FileStore` to get disk space information.

**Requirements:**
- Use `FileStore` to get the size, used space, and available space of a disk.

## Problem 29: Using File Attributes
**Problem Statement:** Write a Java program that retrieves and sets file attributes using `Files` class.

**Requirements:**
- Create a file.
- Use `Files` class to retrieve file attributes like file size, creation time, last modification time, etc.
- Use `Files` class to set file attributes like file permissions, owner, etc.

## Problem 30: Using Asynchronous File Channels
**Problem Statement:** Write a Java program that reads and writes to a file asynchronously using `AsynchronousFileChannel`.

**Requirements:**
- Create a file.
- Use `AsynchronousFileChannel` to write some data to the file asynchronously.
- Use `AsynchronousFileChannel` to read the data back from the file asynchronously.

## Problem 31: Using Memory-Mapped File I/O
**Problem Statement:** Write a Java program that uses memory-mapped file I/O to read and write data to a file.

**Requirements:**
- Create a file.
- Use `FileChannel` to create a memory-mapped buffer for the file.
- Write some data to the buffer and read it back.

## Problem 32: Using Locks with File Channels
**Problem Statement:** Write a Java program that uses locks with file channels to ensure exclusive access to a file.

**Requirements:**
- Create a file.
- Use `FileChannel` to get a lock on the file.
- Try to access the file from another thread or process and handle the `OverlappingFileLockException`.

## Problem 33: Using CompletionHandler with Asynchronous Channels
**Problem Statement:** Write a Java program that uses `CompletionHandler` with asynchronous channels to perform actions when an operation completes.

**Requirements:**
- Use `AsynchronousFileChannel` to write some data to a file asynchronously.
- Use a `CompletionHandler` to perform an action when the write operation completes.

## Problem 34: Using Channels for Inter-Thread Communication
**Problem Statement:** Write a Java program that uses channels for inter-thread communication.

**Requirements:**
- Create two threads.
- One thread writes data to a `Pipe.SinkChannel`.
- The other thread reads data from a `Pipe.SourceChannel` connected to the `SinkChannel`.

## Problem 35: Using URLConnection for Network Communication
**Problem Statement:** Write a Java program that uses `URLConnection` for network communication.

**Requirements:**
- Use `URLConnection` to send a GET request to a web server.
- Read the response from the server and print it to the console.

## Problem 36: Using Socket for TCP Communication
**Problem Statement:** Write a Java program that uses `Socket` for TCP communication.

**Requirements:**
- Create a server that listens for incoming connections using `ServerSocket`.
- Create a client that connects to the server using `Socket`.
- The client sends a message to the server, and the server sends a response back to the client.

## Problem 37: Using DatagramSocket for UDP Communication
**Problem Statement:** Write a Java program that uses `DatagramSocket` for UDP communication.

**Requirements:**
- Create a server that listens for incoming datagrams using `DatagramSocket`.
- Create a client that sends a datagram to the server using `DatagramSocket`.
- The server receives the datagram and sends a response back to the client.

## Problem 38: Using NIO.2 for Asynchronous Network Communication
**Problem Statement:** Write a Java program that uses NIO.2 for asynchronous network communication.

**Requirements:**
- Create a server that listens for incoming connections using `AsynchronousServerSocketChannel`.
- Create a client that connects to the server using `AsynchronousSocketChannel`.
- The client sends a message to the server, and the server sends a response back to the client.

## Problem 39: Using Filtered Streams
**Problem Statement:** Write a Java program that uses filtered streams to modify the data being read from or written to a file.

**Requirements:**
- Create a text file with some content.
- Use a `FilterInputStream` or `FilterOutputStream` to modify the data being read from or written to the file.
- Print the modified content to the console.

## Problem 40: Using Object Streams for Deep Copy
**Problem Statement:** Write a Java program that uses object streams to make a deep copy of an object.

**Requirements:**
- Create a class with some fields.
- Create an object of this class and write it to a `ByteArrayOutputStream` using `ObjectOutputStream`.
- Read the object back from the `ByteArrayInputStream` using `ObjectInputStream` to create a deep copy.
- Verify that the original and copied objects are not the same but their content is identical.

## Problem 41: Using LineNumberReader
**Problem Statement:** Write a Java program that uses `LineNumberReader` to read a text file and print each line with its line number.

**Requirements:**
- Create a text file with multiple lines of text.
- Use `LineNumberReader` to read this file.
- Print each line to the console along with its line number.

## Problem 42: Using StreamTokenizer with Custom Syntax
**Problem Statement:** Write a Java program that uses `StreamTokenizer` to break a text file into tokens using custom syntax rules.

**Requirements:**
- Create a text file with some text.
- Use `StreamTokenizer` to break the text into tokens using custom syntax rules (like treating certain characters as word characters).
- Print each token to the console.

## Problem 43: Using PrintWriter for Formatted Output
**Problem Statement:** Write a Java program that uses `PrintWriter` for formatted output to a file.

**Requirements:**
- Write some formatted strings (like "Hello, %s", "The value is %d") to a file using `PrintWriter`.
- Read the data back from the file and print it to the console.

## Problem 44: Using PipedReader and PipedWriter for Inter-Thread Communication
**Problem Statement:** Write a Java program that uses `PipedReader` and `PipedWriter` for inter-thread communication.

**Requirements:**
- Create two threads.
- One thread writes data to a `PipedWriter`.
- The other thread reads data from a `PipedReader` connected to the `PipedWriter`.

## Problem 45: Using CharArrayReader and CharArrayWriter
**Problem Statement:** Write a Java program that uses `CharArrayReader` and `CharArrayWriter` to read and write data to a character array.

**Requirements:**
- Write some data to a `CharArrayWriter`.
- Read the data back from the `CharArrayReader` and print it to the console.

## Problem 46: Using StringReader and StringWriter
**Problem Statement:** Write a Java program that uses `StringReader` and `StringWriter` to read and write data to a string.

**Requirements:**
- Write some data to a `StringWriter`.
- Read the data back from the `StringReader` and print it to the console.

## Problem 47: Using PushbackReader and PushbackInputStream
**Problem Statement:** Write a Java program that uses `PushbackReader` and `PushbackInputStream` to push back a portion of the read data so that it can be read again.

**Requirements:**
- Read some data from a file or a string using `PushbackReader` or `PushbackInputStream`.
- Push back a portion of the read data.
- Read the data again and print it to the console.

## Problem 48: Using SequenceInputStream
**Problem Statement:** Write a Java program that uses `SequenceInputStream` to concatenate the contents of multiple files.

**Requirements:**
- Create multiple text files with some content.
- Use `SequenceInputStream` to read the contents of these files in sequence.
- Print the concatenated content to the console.

## Problem 49: Using RandomAccessFile
**Problem Statement:** Write a Java program that uses `RandomAccessFile` to read from and write to a file at specific positions.

**Requirements:**
- Create a text file with some content.
- Use `RandomAccessFile` to read from and write to specific positions in the file.
- Print the modified content to the console.

## Problem 50: Using FileChannel for File Copy
**Problem Statement:** Write a Java program that uses `FileChannel` to copy a file.

**Requirements:**
- Create a source file with some content.
- Use `FileChannel` to copy the source file to a destination file.
- Verify that the destination file has the same content as the source file.

## Problem 51: Using MappedByteBuffer for File Copy
**Problem Statement:** Write a Java program that uses `MappedByteBuffer` to copy a file.

**Requirements:**
- Create a source file with some content.
- Use `MappedByteBuffer` to copy the source file to a destination file.
- Verify that the destination file has the same content as the source file.

## Problem 52: Using FileLock for Concurrent File Access
**Problem Statement:** Write a Java program that uses `FileLock` to control access to a file in a multi-threaded program.

**Requirements:**
- Create a file with some content.
- Create multiple threads that try to read from and write to the file concurrently.
- Use `FileLock` to ensure that only one thread can access the file at a time.

## Problem 53: Using Channels for Inter-Thread Communication
**Problem Statement:** Write a Java program that uses `Pipe` for inter-thread communication.

**Requirements:**
- Create two threads.
- One thread writes data to a `Pipe.SinkChannel`.
- The other thread reads data from a `Pipe.SourceChannel` connected to the `SinkChannel`.

## Problem 54: Using AsynchronousFileChannel for File Copy
**Problem Statement:** Write a Java program that uses `AsynchronousFileChannel` to copy a file.

**Requirements:**
- Create a source file with some content.
- Use `AsynchronousFileChannel` to copy the source file to a destination file.
- Verify that the destination file has the same content as the source file.

## Problem 55: Using AsynchronousFileChannel for Concurrent File Access
**Problem Statement:** Write a Java program that uses `AsynchronousFileChannel` to control access to a file in a multi-threaded program.

**Requirements:**
- Create a file with some content.
- Create multiple threads that try to read from and write to the file concurrently.
- Use `AsynchronousFileChannel` to ensure that only one thread can access the file at a time.

## Problem 56: Using AsynchronousSocketChannel and AsynchronousServerSocketChannel
**Problem Statement:** Write a Java program that uses `AsynchronousSocketChannel` and `AsynchronousServerSocketChannel` for network communication.

**Requirements:**
- Create a server that listens for incoming connections using `AsynchronousServerSocketChannel`.
- Create a client that connects to the server using `AsynchronousSocketChannel`.
- The client sends a message to the server, and the server sends a response back to the client.

## Problem 57: Using AsynchronousFileChannel for File Read/Write
**Problem Statement:** Write a Java program that uses `AsynchronousFileChannel` to read from and write to a file.

**Requirements:**
- Create a file with some content.
- Use `AsynchronousFileChannel` to read from and write to the file.
- Print the read content to the console.

## Problem 58: Using CompletionHandler with AsynchronousFileChannel
**Problem Statement:** Write a Java program that uses `CompletionHandler` with `AsynchronousFileChannel` for file operations.

**Requirements:**
- Create a file with some content.
- Use `AsynchronousFileChannel` to read from and write to the file.
- Use a `CompletionHandler` to handle the result of the read/write operations.

## Problem 59: Using Future with AsynchronousFileChannel
**Problem Statement:** Write a Java program that uses `Future` with `AsynchronousFileChannel` for file operations.

**Requirements:**
- Create a file with some content.
- Use `AsynchronousFileChannel` to read from and write to the file.
- Use a `Future` to get the result of the read/write operations.

## Problem 60: Using AsynchronousSocketChannel for Client-Server Communication
**Problem Statement:** Write a Java program that uses `AsynchronousSocketChannel` for client-server communication.

**Requirements:**
- Create a server that listens for incoming connections using `AsynchronousServerSocketChannel`.
- Create a client that connects to the server using `AsynchronousSocketChannel`.
- The client sends a message to the server, and the server sends a response back to the client.

## Problem 61: Using AsynchronousServerSocketChannel for Server-Side Socket Programming
**Problem Statement:** Write a Java program that uses `AsynchronousServerSocketChannel` for server-side socket programming.

**Requirements:**
- Create a server that listens for incoming connections using `AsynchronousServerSocketChannel`.
- When a client connects, the server sends a welcome message to the client.

## Problem 62: Using AsynchronousFileChannel with CompletionHandler for File Operations
**Problem Statement:** Write a Java program that uses `AsynchronousFileChannel` with `CompletionHandler` for file operations.

**Requirements:**
- Create a file with some content.
- Use `AsynchronousFileChannel` to read from and write to the file.
- Use a `CompletionHandler` to handle the result of the read/write operations.

## Problem 63: Using AsynchronousFileChannel with Future for File Operations
**Problem Statement:** Write a Java program that uses `AsynchronousFileChannel` with `Future` for file operations.

**Requirements:**
- Create a file with some content.
- Use `AsynchronousFileChannel` to read from and write to the file.
- Use a `Future` to get the result of the read/write operations.

## Problem 64: Using AsynchronousSocketChannel with CompletionHandler for Client-Server Communication
**Problem Statement:** Write a Java program that uses `AsynchronousSocketChannel` with `CompletionHandler` for client-server communication.

**Requirements:**
- Create a server that listens for incoming connections using `AsynchronousServerSocketChannel`.
- Create a client that connects to the server using `AsynchronousSocketChannel`.
- The client sends a message to the server, and the server sends a response back to the client.
- Use a `CompletionHandler` to handle the result of the read/write operations.

## Problem 65: Using AsynchronousSocketChannel with Future for Client-Server Communication
**Problem Statement:** Write a Java program that uses `AsynchronousSocketChannel` with `Future` for client-server communication.

**Requirements:**
- Create a server that listens for incoming connections using `AsynchronousServerSocketChannel`.
- Create a client that connects to the server using `AsynchronousSocketChannel`.
- The client sends a message to the server, and the server sends a response back to the client.
- Use a `Future` to get the result of the read/write operations.

## Problem 66: Merging Multiple Files into One Using Streams
**Problem Statement:** Write a Java program that merges multiple files into one using streams.

**Requirements:**
- Create multiple text files with some content.
- Use streams to read from these files and write their content into a single file.

## Problem 67: Splitting a Large File into Smaller Chunks Using Streams
**Problem Statement:** Write a Java program that splits a large file into smaller chunks using streams.

**Requirements:**
- Create a large text file with some content.
- Use streams to read from this file and write its content into multiple smaller files.

## Problem 68: Implementing a Multi-threaded File Processing Feature Using Streams
**Problem Statement:** Write a Java program that implements a multi-threaded file processing feature using streams.

**Requirements:**
- Create multiple text files with some content.
- Use streams and Java's concurrency utilities to read from these files concurrently.

## Problem 69: Implementing a Robust Error Handling Strategy for Stream Operations
**Problem Statement:** Write a Java program that implements a robust error handling strategy that logs and manages exceptions occurring during stream operations without crashing the application.

**Requirements:**
- Create a text file with some content.
- Use streams to read from this file.
- Implement error handling that catches and logs any exceptions that occur during the read operation.

## Problem 70: Ensuring All Streams Are Properly Closed to Prevent Resource Leaks
**Problem Statement:** Write a Java program that ensures all streams are properly closed to prevent resource leaks in an application.

**Requirements:**
- Create a text file with some content.
- Use streams to read from and write to this file.
- Ensure all streams are properly closed, even if an exception occurs.

## Problem 71: Writing Unit Tests for a Data Processing Pipeline That Uses Streams
**Problem Statement:** Write a Java program that includes unit tests for a data processing pipeline that uses streams.

**Requirements:**
- Create a data processing pipeline that uses streams to read from and write to files.
- Write unit tests to verify the correctness of the pipeline.