package streams.examples;

import streams.DataStream;
import streams.HumanStream;

import java.util.*;
import java.util.stream.Collectors;

public class FilterExample {
    public static void main(String[] args) {
        DataStream dataStream = DataStream.getInstance();
        List<HumanStream> humanStreamList = dataStream.createHumanData();

        humanStreamList = humanStreamList.stream()
                .filter(element -> element.getAge() > 5 && element.getName().length() > 5)
                .collect(Collectors.toList());

        System.out.println(humanStreamList);

        /*Stream<Human> humanStream = Stream.of(huhuman1, human2, human3);

        humanList = humanStream
                .filter(element -> element.getAge() > 5 && element.getName().length() > 5)
                .collect(Collectors.toList());

        System.out.println(humanList);*/
    }
}

