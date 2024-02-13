package streams;

import streams.serviceInformation.Data;
import streams.serviceInformation.Human;

import java.util.List;

public class TestStreamSkip {
    public static void main(String[] args) {
        List<Human> humanList = Data.getInstance().createHumanData();

        humanList.stream()
                .filter(e -> e.getAge() > 3)
                .forEach(System.out::println);
        System.out.println();

        humanList.stream()
                .filter(e -> e.getAge() > 3)
                .limit(3)
                .forEach(System.out::println);
        System.out.println();

        humanList.stream()
                .filter(e -> e.getAge() > 3)
                .skip(2)
                .forEach(System.out::println);
    }
}
