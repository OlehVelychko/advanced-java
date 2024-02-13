package streams;

import streams.serviceInformation.Data;
import streams.serviceInformation.Human;

import java.util.Comparator;

public class TestStreamFindFirst {
    public static void main(String[] args) {
        Human first = Data.getInstance().createHumanData().stream()
                .filter(e -> e.getSex().equals(Human.Sex.FEMALE))
                .sorted(Comparator.comparing(Human::getAge))
                .findFirst().get();
        System.out.println(first);
    }
}
