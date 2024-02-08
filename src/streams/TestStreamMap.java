package streams;

import java.util.*;
import java.util.stream.Collectors;

public class TestStreamMap {
    public static void main(String[] args) {
        /*List<String> list = new ArrayList<>();
        list.add("Rita");
        list.add("Alice");
        list.add("Kuznets");
        list.add("Artur");
        list.add("Rizhii");

        List<Integer> integerList = list.stream().map(element -> element.length())
                .collect(Collectors.toList());

        System.out.println(integerList);
        System.out.println(list);*/

        /*int[] array = {5, 2, 0, 5, 6, 1, 2, 3};
        array = Arrays.stream(array).map(element
                -> {
            if (element % 3 == 0) {
                element = element / 3;
            }
            return element;
        }).toArray();

        System.out.println(Arrays.toString(array));*/

        Set<String> set = new TreeSet<>();
        set.add("Rita");
        set.add("Alice");
        set.add("Kuznets");
        set.add("Artur");
        set.add("Rizhii");

        System.out.println(set);

        Set<Integer> integerSet = set.stream().map(e -> e.length()).collect(Collectors.toSet());
        List<Integer> integerSet2 = set.stream().map(e -> e.length()).collect(Collectors.toList());

        System.out.println(integerSet);
        System.out.println(integerSet2);

    }
}

