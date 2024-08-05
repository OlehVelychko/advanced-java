package functional_interfaces.examples;

import functional_interfaces.DataFI;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class SupplierExample implements Supplier<String> {
    private final String name;

    public SupplierExample(String name) {
        this.name = name;
    }
    @Override
    public String get() {
        return "*Hello, " + name + "!*";
    }

    public static void extractedMyImplSupplier() {
        List<String> names = DataFI.list.stream()
                .map(name -> new SupplierExample(name).get())
                .collect(Collectors.toList());

        System.out.println(names);
    }
}
