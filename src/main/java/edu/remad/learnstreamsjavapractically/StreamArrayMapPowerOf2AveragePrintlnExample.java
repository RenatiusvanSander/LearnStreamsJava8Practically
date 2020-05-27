package edu.remad.learnstreamsjavapractically;

import java.util.Arrays;

/**
 * Prints of an integer array the average of all integers, which are powered with itself.
 * @author Remy Meier
 */
public class StreamArrayMapPowerOf2AveragePrintlnExample {

    public static void main(String[] args) {
        Arrays.stream(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::println);
    }

}
