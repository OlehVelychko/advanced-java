package streams;

import streams.serviceInformation.Data;
import streams.serviceInformation.Human;

import java.util.List;
import java.util.stream.Collectors;

public class TestStreamMapToInt {
    public static void main(String[] args) {
        List<Human> humanList = Data.getInstance().createHumanData();

        List<Integer> years = humanList.stream()
                .mapToInt(Human::getAge)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(years);
        System.out.println();

        int sumYears = humanList.stream()
                .mapToInt(Human::getAge)
                .sum();
        System.out.println(sumYears);
        System.out.println();

        double averageYears = humanList.stream()
                .mapToInt(Human::getAge)
                .average().getAsDouble();
        System.out.println(averageYears);
        System.out.println();

        int min = humanList.stream()
                .mapToInt(Human::getAge)
                .min().getAsInt();
        System.out.println(min);
    }
}
