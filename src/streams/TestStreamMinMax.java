package streams;

import streams.serviceInformation.Data;
import streams.serviceInformation.Human;

import java.util.Comparator;

public class TestStreamMinMax {
    public static void main(String[] args) {
        /*Human youngest = Data.getInstance().createHumanData().stream()
                .min((x, y) -> x.getAge() - y.getAge()).get();
        System.out.println(youngest);*/

        Human oldest = Data.getInstance().createHumanData().stream()
                .max(Comparator.comparingInt(Human::getAge)).get();
        System.out.println(oldest);
    }
}
