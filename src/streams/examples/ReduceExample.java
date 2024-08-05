package streams.examples;

import streams.DataStream;

import java.util.List;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> list = DataStream.getInstance().createIntegerData();
        int result = list.stream()
                .reduce((accumulator, element) -> accumulator * element).get();
        System.out.println(result);

        List<String> stringList = DataStream.getInstance().createStringData();
        String res = stringList.stream()
                .reduce((accumulator, element) -> accumulator + " $ " + element).get();
        System.out.println(res);
     }
}
