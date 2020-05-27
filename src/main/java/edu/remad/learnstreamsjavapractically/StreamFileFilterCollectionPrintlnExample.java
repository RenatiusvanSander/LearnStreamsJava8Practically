package edu.remad.learnstreamsjavapractically;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Prints a streamed file, where filter contains a sample string.
 * @author Remy Meier
 */
public class StreamFileFilterCollectionPrintlnExample {

    public static void main(String[] args) {
        try {
            List<String> files = Files.lines(Paths.get("lines.txt")).filter(x -> x.contains("jit")).collect(Collectors.toList());
            files.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
