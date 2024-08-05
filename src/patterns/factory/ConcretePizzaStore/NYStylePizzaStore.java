package patterns.factory.ConcretePizzaStore;

import patterns.factory.ConcretePizza.NYStyleCheesePizza;
import patterns.factory.ConcretePizza.NYStyleClamPizza;
import patterns.factory.ConcretePizza.NYStylePepperoniPizza;
import patterns.factory.ConcretePizza.NYStyleVeggiePizza;
import patterns.factory.Pizza;
import patterns.factory.PizzaStore;

public class NYStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        return switch (item) {
            case "cheese" -> new NYStyleCheesePizza();
            case "pepperoni" -> new NYStylePepperoniPizza();
            case "clam" -> new NYStyleClamPizza();
            case "veggie" -> new NYStyleVeggiePizza();
            default -> null;
        };
    }
}
