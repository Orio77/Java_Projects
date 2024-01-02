package java_8_streams_api.problem8;

import java.util.ArrayList;
import java.util.List;

// Java code

// Problem 8: Terminal Operations

public class TerminalOperations {
    // Define a Sale class with an attribute for the totalAmount.
    static class Sale {
        double totalAmount;

        // Constructor
        public Sale(double totalAmount) {
            this.totalAmount = totalAmount;
        }

        // Getter
        public double getTotalAmount() {
            return totalAmount;
        }
    }

    public static void main(String[] args) {
        // Initialize a list of Sale objects with various totalAmounts.
        List<Sale> sales = new ArrayList<>();
        sales.add(new Sale(100.50));
        sales.add(new Sale(200.75));
        sales.add(new Sale(150.00));
        sales.add(new Sale(175.25));
        sales.add(new Sale(300.00));

        // Use Java streams and terminal operations to calculate the sum of all sales.
        int sum = sales.stream()
                        .map(s -> (int) s.getTotalAmount())
                        .mapToInt(i -> i.intValue())
                        .sum();
        // Print the total sum to the console.
        System.out.println(sum);
    }
}
