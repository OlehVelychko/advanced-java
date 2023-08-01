package PatternDecorator.RealBeverages;

import PatternDecorator.Beverage;

public class Espresso extends Beverage {
    @Override
    public double cost() {
        return 1.99;
    }

    public Espresso() {
        description = "Espresso";
    }
}
