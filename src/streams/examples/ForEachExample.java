package streams.examples;

import streams.DataStream;

import java.util.Arrays;

public class ForEachExample {
    public static void main(String[] args) {
        int[] array = DataStream.getInstance().createIntArrayData();

        /*Arrays.stream(array)
                .forEach(element -> {element *= 2;
                    System.out.println(element);});*/

//        Arrays.stream(array).forEach(element -> System.out.println(element));

//        Arrays.stream(array).forEach(System.out::println);

        Arrays.stream(array).forEach(Utils::myMethod);

//        Arrays.stream(array).forEach(element -> Utils.myMethod(element));

    }

    private static class Utils {
        public static void myMethod(int x) {
            x += 5;
            System.out.println("that is " + x);
        }
    }
}

