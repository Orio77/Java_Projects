package java_8_streams_api.problem12.prepare_problems;

// Java code

// Problem 12.3: Combining Sorting and Reduction

import java.time.LocalDate;
import java.util.Comparator;
import java.util.stream.Stream;

public class CombiningSortingAndReduction {
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

        // Use Java streams to sort all transactions by amount in ascending order and calculate the total amount.

        Stream<Transaction> sortedTransactions = transactions.sorted(Comparator.comparing(Transaction::getAmount));

        double sum = sortedTransactions.mapToDouble(t -> t.getAmount()).sum();
        // Print the sorted transactions and the total amount to the console.
        System.out.println(sum);
    }
}
