package streams.examples;

import streams.DataStream;
import streams.HumanStream;

import java.util.Comparator;
import java.util.List;


public class ChainingExample {
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

        List<HumanStream> humanStreamList = DataStream.getInstance().createHumanData();
        humanStreamList.stream()
                .map(element -> {
                    element.setName(element.getName().toUpperCase());
                    return element;
                })
                .filter(element -> element.getSex().equals(HumanStream.Sex.FEMALE))
                .sorted(Comparator.comparing(HumanStream::getAge))
                .forEach(System.out::println);
    }
}
