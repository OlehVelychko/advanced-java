package streams;

import streams.serviceInformation.Data;
import streams.serviceInformation.Family;
import streams.serviceInformation.Human;

import java.util.ArrayList;
import java.util.List;

public class TestStreamFlatMap {
    public static void main(String[] args) {
        Family family1 = new Family("Male");
        Family family2 = new Family("Female");

        List<Human> humanList = Data.getInstance().createHumanData();
        for (Human human : humanList) {
            if (human.getSex().equals(Human.Sex.MALE)) {
                family1.addToFamily(human);
            } else {
                family2.addToFamily(human);
            }
        }

        List<Family> familyList = new ArrayList<>();
        familyList.add(family1);
        familyList.add(family2);

        familyList.stream().flatMap(family -> family.getList().stream())
                .forEach(e -> System.out.println(e.getName()));

    }


}
