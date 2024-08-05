package streams.examples;

import streams.DataStream;
import streams.HumanStream;

import java.util.Comparator;

public class FindFirstExample {
    public static void main(String[] args) {
        HumanStream first = DataStream.getInstance().createHumanData().stream()
                .filter(e -> e.getSex().equals(HumanStream.Sex.FEMALE))
                .sorted(Comparator.comparing(HumanStream::getAge))
                .findFirst().get();
        System.out.println(first);
    }
}
