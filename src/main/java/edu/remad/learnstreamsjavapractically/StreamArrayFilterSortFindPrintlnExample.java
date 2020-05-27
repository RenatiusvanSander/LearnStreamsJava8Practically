package edu.remad.learnstreamsjavapractically;

import java.util.Arrays;

/**
 * Streams array of string, which is filtered by starting with a, sorted
 * and first found word is printed.
 * @author Remy Meier
 */
public class StreamArrayFilterSortFindPrintlnExample {

    public static void main(String[] args) {
        String[] words = new String[]{"1", "Anatoli", "Pamelali", "!"};
        Arrays.stream(words)
                .filter(x -> x.toLowerCase().startsWith("a"))
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);
    }
}
