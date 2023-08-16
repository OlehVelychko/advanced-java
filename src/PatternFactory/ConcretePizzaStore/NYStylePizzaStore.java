package PatternFactory.ConcretePizzaStore;

import PatternFactory.ConcretePizza.NYStyleCheesePizza;
import PatternFactory.ConcretePizza.NYStyleClamPizza;
import PatternFactory.ConcretePizza.NYStylePepperoniPizza;
import PatternFactory.ConcretePizza.NYStyleVeggiePizza;
import PatternFactory.Pizza;
import PatternFactory.PizzaStore;

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
