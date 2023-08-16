package PatternFactory.ConcretePizzaStore;

import PatternFactory.ConcretePizza.*;
import PatternFactory.Pizza;
import PatternFactory.PizzaStore;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        return switch (item) {
            case "cheese" -> new ChicagoStyleCheesePizza();
            case "pepperoni" -> new ChicagoStylePepperoniPizza();
            case "clam" -> new ChicagoStyleClamPizza();
            case "veggie" -> new ChicagoStyleVeggiePizza();
            default -> null;
        };
    }
}
