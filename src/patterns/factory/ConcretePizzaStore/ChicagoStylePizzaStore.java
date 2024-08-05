package patterns.factory.ConcretePizzaStore;

import patterns.factory.Pizza;
import patterns.factory.PizzaStore;
import patterns.factory.ConcretePizza.ChicagoStyleCheesePizza;
import patterns.factory.ConcretePizza.ChicagoStyleClamPizza;
import patterns.factory.ConcretePizza.ChicagoStylePepperoniPizza;
import patterns.factory.ConcretePizza.ChicagoStyleVeggiePizza;

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
