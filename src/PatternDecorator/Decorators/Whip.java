package PatternDecorator.Decorators;

import PatternDecorator.Beverage;
import PatternDecorator.CondimentDecorator;

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
