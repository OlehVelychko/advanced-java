package patterns.decorator.realBeverages;

import patterns.decorator.Beverage;
import patterns.decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {
    @Override
    public double cost() {
        return beverage.cost() + .80;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
}
