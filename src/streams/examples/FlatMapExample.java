package streams.examples;

import streams.DataStream;
import streams.FamilyStream;
import streams.HumanStream;

import java.util.ArrayList;
import java.util.List;

public class FlatMapExample {
    public static void main(String[] args) {
        FamilyStream familyStream1 = new FamilyStream("Male");
        FamilyStream familyStream2 = new FamilyStream("Female");

        List<HumanStream> humanStreamList = DataStream.getInstance().createHumanData();
        for (HumanStream humanStream : humanStreamList) {
            if (humanStream.getSex().equals(HumanStream.Sex.MALE)) {
                familyStream1.addToFamily(humanStream);
            } else {
                familyStream2.addToFamily(humanStream);
            }
        }

        List<FamilyStream> familyStreamList = new ArrayList<>();
        familyStreamList.add(familyStream1);
        familyStreamList.add(familyStream2);

        familyStreamList.stream().flatMap(familyStream -> familyStream.getList().stream())
                .forEach(e -> System.out.println(e.getName()));

    }


}
