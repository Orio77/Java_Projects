package java_8_streams_api.problem12.prepare_problems;

// Problem 12.1: Basic Stream Sorting

import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BasicStreamSorting {
    public static void main(String[] args) {
        // Initialize a Stream of LocalDate objects.
        Stream<LocalDate> dates = Stream.of(
            LocalDate.of(2021, 3, 12),
            LocalDate.of(2020, 4, 15),
            LocalDate.of(2022, 1, 10),
            LocalDate.of(2021, 2, 28),
            LocalDate.of(2021, 11, 30)
        );

        // Use Java streams to sort all dates in ascending order.
        Stream<LocalDate> sortedDates = dates.sorted();
        // Print the sorted dates to the console.
        System.out.println(sortedDates.collect(Collectors.toList()));
    }
}