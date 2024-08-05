package patterns.strategy.ImplementationIndividualDuckBehavior;

import patterns.strategy.Interfaces.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
