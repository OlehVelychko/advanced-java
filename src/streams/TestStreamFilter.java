package streams;

import streams.serviceInformation.Data;
import streams.serviceInformation.Human;

import java.util.*;
import java.util.stream.Collectors;

public class TestStreamFilter {
    public static void main(String[] args) {
        Data data = Data.getInstance();
        List<Human> humanList = data.createHumanData();

        humanList = humanList.stream()
                .filter(element -> element.getAge() > 5 && element.getName().length() > 5)
                .collect(Collectors.toList());

        System.out.println(humanList);

        /*Stream<Human> humanStream = Stream.of(huhuman1, human2, human3);

        humanList = humanStream.
                filter(element -> element.getAge() > 5 && element.getName().length() > 5)
                .collect(Collectors.toList());

        System.out.println(humanList);*/
    }
}

