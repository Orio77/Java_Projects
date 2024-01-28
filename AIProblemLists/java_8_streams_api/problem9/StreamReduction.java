package java_8_streams_api.problem9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Java code

// Problem 9: Stream Reduction

public class StreamReduction {
    // Define an Item class with an attribute for the price.
    static class Item {
        double price;

        // Constructor
        public Item(double price) {
            this.price = price;
        }

        // Getter
        public double getPrice() {
            return price;
        }
    }

    // Define an Order class with a List of Item objects.
    static class Order {
        List<Item> items;

        // Constructor
        public Order(List<Item> items) {
            this.items = items;
        }

        // Getter
        public List<Item> getItems() {
            return items;
        }
    }

    public static void main(String[] args) {
        // Initialize a list of Order objects with various Items and prices.
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(Arrays.asList(new Item(10.0), new Item(20.0), new Item(30.0))));
        orders.add(new Order(Arrays.asList(new Item(15.0), new Item(25.0))));
        orders.add(new Order(Arrays.asList(new Item(10.0), new Item(20.0))));
        orders.add(new Order(Arrays.asList(new Item(30.0), new Item(40.0))));
        orders.add(new Order(Arrays.asList(new Item(50.0))));
        orders.add(new Order(Arrays.asList(new Item(60.0), new Item(70.0))));
        orders.add(new Order(Arrays.asList(new Item(80.0), new Item(90.0))));
        orders.add(new Order(Arrays.asList(new Item(100.0), new Item(110.0))));
        orders.add(new Order(Arrays.asList(new Item(120.0), new Item(130.0))));
        orders.add(new Order(Arrays.asList(new Item(140.0), new Item(150.0))));

        // Use Java streams and reduction to calculate the total price of all orders.
        int totalSum = orders.stream().map(o -> o.getItems().stream().map(i -> i.getPrice()).mapToInt(i -> i.intValue()).sum()).reduce(0, (p1, p2) -> p1 + p2);
        // Print the total price to the console.
        System.out.println(totalSum);
    }
}
