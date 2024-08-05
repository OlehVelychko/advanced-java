package patterns.decorator.realBeverages;

import patterns.decorator.Beverage;
import patterns.decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {
    @Override
    public double cost() {
        return beverage.cost() + .35;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
}
