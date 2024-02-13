package streams;

import streams.serviceInformation.Data;
import streams.serviceInformation.Human;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class TestStreamChaining {
    public static void main(String[] args) {
        /*int[] array = Data.getInstance().createIntArrayData();
        int result = Arrays.stream(array)
                .filter(element -> element % 2 != 0)
                .map(element -> {
                    if (element % 3 == 0) {
                        element = element / 3;
                    }
                    return element;
                })
                .reduce(Integer::sum).getAsInt();
        System.out.println(result);*/

        List<Human> humanList = Data.getInstance().createHumanData();
        humanList.stream()
                .map(element -> {
                    element.setName(element.getName().toUpperCase());
                    return element;
                })
                .filter(element -> element.getSex().equals(Human.Sex.FEMALE))
                .sorted(Comparator.comparing(Human::getAge))
                .forEach(System.out::println);
    }
}
