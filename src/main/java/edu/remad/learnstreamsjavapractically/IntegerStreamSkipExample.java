package edu.remad.learnstreamsjavapractically;

import java.util.stream.IntStream;

/**
 * Streams Integer between 0 until 200 and skips 100 elements from beginning.
 * @author Remy Meier
 */
public class IntegerStreamSkipExample {

    public static void main(String[] args) {
        IntStream.range(1, 201)
                .skip(100)
                .forEach(System.out::println);
    }
}
