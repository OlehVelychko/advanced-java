package streams;

import java.util.stream.Stream;

public class TestStreamCount {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 1, 4, 1, 3, 2, 5, 8, 5, 4, 1);
//        System.out.println(stream.distinct().count());

        Long result = stream.count();
        System.out.println(result);
    }
}
