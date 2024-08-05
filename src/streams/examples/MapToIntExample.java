package streams.examples;

import streams.DataStream;
import streams.HumanStream;

import java.util.List;
import java.util.stream.Collectors;

public class MapToIntExample {
    public static void main(String[] args) {
        List<HumanStream> humanStreamList = DataStream.getInstance().createHumanData();

        List<Integer> years = humanStreamList.stream()
                .mapToInt(HumanStream::getAge)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(years);
        System.out.println();

        int sumYears = humanStreamList.stream()
                .mapToInt(HumanStream::getAge)
                .sum();
        System.out.println(sumYears);
        System.out.println();

        double averageYears = humanStreamList.stream()
                .mapToInt(HumanStream::getAge)
                .average().getAsDouble();
        System.out.println(averageYears);
        System.out.println();

        int min = humanStreamList.stream()
                .mapToInt(HumanStream::getAge)
                .min().getAsInt();
        System.out.println(min);
    }
}
