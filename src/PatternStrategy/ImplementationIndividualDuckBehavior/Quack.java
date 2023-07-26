package PatternStrategy.ImplementationIndividualDuckBehavior;

import PatternStrategy.Interfaces.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
