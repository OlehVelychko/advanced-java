package streams.examples;

import streams.DataStream;
import streams.HumanStream;

import java.util.List;

public class SkipExample {
    public static void main(String[] args) {
        List<HumanStream> humanStreamList = DataStream.getInstance().createHumanData();

        humanStreamList.stream()
                .filter(e -> e.getAge() > 3)
                .forEach(System.out::println);
        System.out.println();

        humanStreamList.stream()
                .filter(e -> e.getAge() > 3)
                .limit(3)
                .forEach(System.out::println);
        System.out.println();

        humanStreamList.stream()
                .filter(e -> e.getAge() > 3)
                .skip(2)
                .forEach(System.out::println);
    }
}
