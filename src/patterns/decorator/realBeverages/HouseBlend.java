package patterns.decorator.realBeverages;

import patterns.decorator.Beverage;

public class HouseBlend extends Beverage {
    @Override
    public double cost() {
        return .89;
    }

    public HouseBlend() {
        description = "House Blend Coffee";
    }
}
