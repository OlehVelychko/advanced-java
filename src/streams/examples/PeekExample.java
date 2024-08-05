package streams.examples;

import java.util.stream.Stream;

public class PeekExample {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 2, 5, 8, 5, 4, 1);
        System.out.println(stream.distinct().peek(System.out::println).count());
    }
}
