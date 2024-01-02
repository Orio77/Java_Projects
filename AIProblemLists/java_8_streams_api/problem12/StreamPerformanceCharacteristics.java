package java_8_streams_api.problem12;

// Java code

// Problem 12: Understanding of Stream Performance Characteristics

import java.time.LocalDate;
import java.util.stream.Stream;

public class StreamPerformanceCharacteristics {
    // Define a Transaction class with attributes for the date and amount.
    static class Transaction {
        LocalDate date;
        double amount;

        // Constructor
        public Transaction(LocalDate date, double amount) {
            this.date = date;
            this.amount = amount;
        }

        // Getters
        public LocalDate getDate() {
            return date;
        }

        public double getAmount() {
            return amount;
        }
    }

    public static void main(String[] args) {
        // Initialize a Stream of Transaction objects with various dates and amounts.
        Stream<Transaction> transactions = Stream.of(
            new Transaction(LocalDate.of(2021, 1, 20), 100.0),
            new Transaction(LocalDate.of(2021, 2, 15), 200.0),
            new Transaction(LocalDate.of(2021, 3, 10), 150.0),
            new Transaction(LocalDate.of(2021, 4, 5), 300.0),
            new Transaction(LocalDate.of(2021, 5, 1), 250.0)
        );

        // Use Java streams to sort all transactions by date in descending order and calculate the total amount.
        
        // Print the sorted transactions and the total amount to the console.
    }
}
