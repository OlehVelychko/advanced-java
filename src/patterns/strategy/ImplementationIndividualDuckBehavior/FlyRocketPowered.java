package patterns.strategy.ImplementationIndividualDuckBehavior;

import patterns.strategy.Interfaces.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I’m flying with a rocket!");
    }
}
