package streams;

import streams.serviceInformation.Data;
import streams.serviceInformation.Human;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreamSorted {
    public static void main(String[] args) {
        /*int[] array = Data.getInstance().createIntArrayData();
        array = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array));*/

        List<Human> humanList = Data.getInstance().createHumanData();

        humanList = humanList.stream()
                .sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
                .collect(Collectors.toList());

        humanList = humanList.stream()
                .sorted(Comparator.comparing(Human::getName))
                .collect(Collectors.toList());
        System.out.println(humanList);
    }
}
