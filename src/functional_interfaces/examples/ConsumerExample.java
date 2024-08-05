package functional_interfaces.examples;

import functional_interfaces.DataFI;

import java.util.function.Consumer;

public class ConsumerExample implements Consumer<String> {
    @Override
    public void accept(String string) {
        System.out.println(string);
    }

    public static void extractedMyImplConsumer() {
        ConsumerExample myConsumer = new ConsumerExample();

        DataFI.list.stream()
                .forEach(myConsumer);
    }
}
