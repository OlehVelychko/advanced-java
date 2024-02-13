package streams;

import streams.serviceInformation.Data;
import streams.serviceInformation.Human;

import java.util.List;

public class TestStreamLimit {
    public static void main(String[] args) {
        Data.getInstance().createHumanData().stream()
                .filter(e -> e.getAge() > 5)
                .limit(2)
                .forEach(System.out::println);
    }
}
