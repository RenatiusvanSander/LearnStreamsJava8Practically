package edu.remad.learnstreamsjavapractically;

import java.util.Arrays;
import java.util.List;

/**
 * Prints results of an array, which starts all with a.
 * @author Remy Meier
 */
public class StreamListMapFilterPrintlnExample {

    public static void main(String[] args) {
        List<String> people = Arrays.asList("Pam", "Danny", "Adrien", "Hans-Peter", "Ute", "Imi");
        people.stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("a"))
                .forEach(System.out::println);
    }
}
