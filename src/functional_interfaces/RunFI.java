package functional_interfaces;

import functional_interfaces.examples.ConsumerExample;
import functional_interfaces.examples.FunctionExample;
import functional_interfaces.examples.PredicateExample;
import functional_interfaces.examples.SupplierExample;

public class RunFI {
    public static void main(String[] args) {
        // Calling <Functional interface> in stream
        FunctionExample.extractedFunctionInterface();

        // Calling <Predicate interface> in stream
        PredicateExample.extractedMyImpPredicate();

        // Calling <Consumer interface> in stream
        ConsumerExample.extractedMyImplConsumer();

        //Calling <Supplier interface> in stream
        SupplierExample.extractedMyImplSupplier();
    }


}