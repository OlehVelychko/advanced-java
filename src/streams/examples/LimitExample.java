package streams.examples;

import streams.DataStream;

public class LimitExample {
    public static void main(String[] args) {
        DataStream.getInstance().createHumanData().stream()
                .filter(e -> e.getAge() > 5)
                .limit(2)
                .forEach(System.out::println);
    }
}
