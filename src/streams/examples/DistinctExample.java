package streams.examples;

import java.util.stream.Stream;

public class DistinctExample {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 2, 5, 8, 5, 4, 1);
        stream.distinct().forEach(System.out::println);
    }
}
