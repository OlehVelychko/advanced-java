package streams;

import streams.serviceInformation.Data;
import streams.serviceInformation.Human;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestStreamGroupingByPartitioningBy {
    public static void main(String[] args) {
        /*Map<Human.Sex, List<Human>> map = Data.getInstance().createHumanData().stream()
                .map(e -> {
                    e.setName(e.getName().toUpperCase());
                    return e;
                })
                .collect(Collectors.groupingBy(Human::getSex));

        for (Map.Entry<Human.Sex, List<Human>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue().toString());
        }*/

        Map<Boolean, List<Human>> map = Data.getInstance().createHumanData().stream()
                .collect(Collectors.partitioningBy(e -> e.getAge() > 34));

        for (Map.Entry<Boolean, List<Human>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue().toString());
        }
    }
}