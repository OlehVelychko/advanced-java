package streams;

import streams.serviceInformation.Data;

import java.util.*;
import java.util.stream.Collectors;

public class TestStreamMap {
    public static void main(String[] args) {
        List<String> list = Data.getInstance().createStringData();
        List<Integer> integerList = list.stream().map(element -> element.length())
                .collect(Collectors.toList());
        System.out.println(list);
        System.out.println(integerList);

        /*int[] array = data.createIntArrayData();
        array = Arrays.stream(array)
                .map(element -> {
                    if (element % 3 == 0) {
                        element = element / 3;
                    }
                    return element;
                }).toArray();
        System.out.println(Arrays.toString(array));*/

        /*Set<String> set = Data.getInstance().createTreeSetStringData();
        System.out.println(set);

        Set<Integer> integerSet = set.stream().
                map(e -> e.length()).collect(Collectors.toSet());
        List<Integer> integerSet2 = set.stream()
                .map(e -> e.length()).collect(Collectors.toList());

        System.out.println(integerSet);
        System.out.println(integerSet2);*/
    }
}

