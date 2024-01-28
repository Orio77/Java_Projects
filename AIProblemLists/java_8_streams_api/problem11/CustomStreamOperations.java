package java_8_streams_api.problem11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Java code

// Problem 11: Custom Stream Operations

public class CustomStreamOperations {
    // Define an Email class with attributes for the subject and body.
    static class Email {
        String subject;
        String body;

        // Constructor
        public Email(String subject, String body) {
            this.subject = subject;
            this.body = body;
        }

        // Getters
        public String getSubject() {
            return subject;
        }

        public String getBody() {
            return body;
        }

        @Override
        public String toString() {
            return this.subject;
        }
    }

    public static void main(String[] args) {
        // Initialize a Stream of Email objects with various subjects and bodies.
        Stream<Email> emails = Stream.of(
            new Email("Hello", "How are you?"),
            new Email("Congratulations", "You've won a prize!"),
            new Email("Important", "Please read this message"),
            new Email("Spam", "This is a spam message"),
            new Email("Greetings", "Hello from the other side"),
            new Email("Spam", "Another spam message")
        );

        // Define a list of spam keywords.
        List<String> spamKeywords = Arrays.asList("spam", "prize", "won", "congratulations");

        // Use Java streams and a custom operation to filter emails based on the list of spam keywords.
        List<Email> noSpam = emails.filter(email -> !isSpam(email, spamKeywords)).collect(Collectors.toList());
        
        System.out.println(noSpam);
    }

    private static boolean isSpam(Email email, List<String> spamKeywords) {
        String lowerSubject = email.getSubject().toLowerCase();
        String lowerBody = email.getBody().toLowerCase();
        return spamKeywords.stream().anyMatch(keyword -> lowerSubject.contains(keyword) || lowerBody.contains(keyword));
    }
}