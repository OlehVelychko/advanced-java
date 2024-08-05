package functional_interfaces.examples;

import functional_interfaces.DataFI;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample implements Predicate<String> {
    @Override
    public boolean test(String string) {
        return string.length() > 5;
    }

    public static void extractedMyImpPredicate() {
        PredicateExample myPredicate = new PredicateExample();
        List<String> filteredNames = DataFI.list.stream()
                .filter(myPredicate)
                .collect(Collectors.toList());

        System.out.println(filteredNames);
    }
}
