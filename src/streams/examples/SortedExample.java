package streams.examples;

import streams.DataStream;
import streams.HumanStream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedExample {
    public static void main(String[] args) {
        /*int[] array = Data.getInstance().createIntArrayData();
        array = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array));*/

        List<HumanStream> humanStreamList = DataStream.getInstance().createHumanData();

        humanStreamList = humanStreamList.stream()
                .sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
                .collect(Collectors.toList());

        humanStreamList = humanStreamList.stream()
                .sorted(Comparator.comparing(HumanStream::getName))
                .collect(Collectors.toList());
        System.out.println(humanStreamList);
    }
}
