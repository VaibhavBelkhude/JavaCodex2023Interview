package com.nt.findlast;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<String> find = Arrays.asList("AB", "BC", "AB", "ED", "BS", "FD");

        // Create a Map to store the count of each unique string
        Map<String, Integer> stringCountMap = new HashMap<>();

        // Count occurrences of each string
        for (String str : find) {
            stringCountMap.put(str, stringCountMap.getOrDefault(str, 0) + 1);
        }

        // Print the results
        for (Map.Entry<String, Integer> entry : stringCountMap.entrySet()) {
            System.out.println("String: " + entry.getKey() + ", Occurrences: " + entry.getValue());
        }
        
        //2
     // Using Stream API to find the last element
        Optional<String> lastElement = find.stream()
                .reduce((first, second) -> second);

        // Check if the last element is present and print it
        if (lastElement.isPresent()) {
            System.out.println("Last element: " + lastElement.get());
        } else {
            System.out.println("List is empty.");
        }
    }
}
