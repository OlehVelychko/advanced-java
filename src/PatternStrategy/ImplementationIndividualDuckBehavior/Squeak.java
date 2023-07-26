package PatternStrategy.ImplementationIndividualDuckBehavior;

import PatternStrategy.Interfaces.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
