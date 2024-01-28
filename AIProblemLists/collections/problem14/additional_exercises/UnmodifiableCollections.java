package collections.problem14.additional_exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableCollections {
    public static void main(String[] args) {
        // Step 1: Create a list of strings representing a roster of players
        List<String> roster = new ArrayList<>();

        // Step 2: Add players to the roster
        roster.add("roster1");
        roster.add("roster2");
        roster.add("roster3");

        // Step 3: Create an unmodifiable view of the roster
        List<String> unmodifiableRoster = Collections.unmodifiableList(roster);

        // Step 4: Attempt to add a new player to the unmodifiable list
        // Step 5: Handle the resulting exception properly
        // TODO: Handle the resulting exception properly
        try {
            unmodifiableRoster.add("roster4");
        } catch (UnsupportedOperationException e) {
            System.out.println("Exception caught. Stack trace: ");
            
            e.printStackTrace();
        }
    }
}