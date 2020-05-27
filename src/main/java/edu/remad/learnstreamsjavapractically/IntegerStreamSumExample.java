package edu.remad.learnstreamsjavapractically;

import java.util.stream.IntStream;

/**
 * Prints the sum of Integers between 1 until 200.
 * @author Remy Meier
 */
public class IntegerStreamSumExample {

    public static void main(String[] args) {
        System.out.println(IntStream
                .range(1, 201)
                .sum()
        );
    }
}
