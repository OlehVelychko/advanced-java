package PatternDecorator.Decorators;

import PatternDecorator.Beverage;
import PatternDecorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    @Override
    public double cost() {
        return beverage.cost() + .20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
}
