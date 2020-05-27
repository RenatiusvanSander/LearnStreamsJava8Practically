package edu.remad.learnstreamsjavapractically;

import java.util.stream.Stream;

/**
 * Prints the sorted first string.
 * @author Remy Meier
 */
public class StreamsOfSortFindFirstPrintlnExample {

    public static void main(String[] args) {
        Stream.of("1","Anatoli","Pamelali","!")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);
    }
}
