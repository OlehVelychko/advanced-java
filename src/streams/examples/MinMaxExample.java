package streams.examples;

import streams.DataStream;
import streams.HumanStream;

import java.util.Comparator;

public class MinMaxExample {
    public static void main(String[] args) {
        /*Human youngest = Data.getInstance().createHumanData().stream()
                .min((x, y) -> x.getAge() - y.getAge()).get();
        System.out.println(youngest);*/

        HumanStream oldest = DataStream.getInstance().createHumanData().stream()
                .max(Comparator.comparingInt(HumanStream::getAge)).get();
        System.out.println(oldest);
    }
}
