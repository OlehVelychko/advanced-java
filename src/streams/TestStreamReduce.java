package streams;

import streams.serviceInformation.Data;

import java.util.ArrayList;
import java.util.List;

public class TestStreamReduce {
    public static void main(String[] args) {
        List<Integer> list = Data.getInstance().createIntegerData();
        int result = list.stream()
                .reduce((accumulator, element) -> accumulator * element).get();
        System.out.println(result);

        List<String> stringList = Data.getInstance().createStringData();
        String res = stringList.stream()
                .reduce((accumulator, element) -> accumulator + " $ " + element).get();
        System.out.println(res);
     }
}
