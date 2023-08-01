package PatternDecorator;

public abstract class Beverage {
    public String description = "Unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
