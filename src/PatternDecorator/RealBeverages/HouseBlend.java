package PatternDecorator.RealBeverages;

import PatternDecorator.Beverage;

public class HouseBlend extends Beverage {
    @Override
    public double cost() {
        return .89;
    }

    public HouseBlend() {
        description = "House Blend Coffee";
    }
}
