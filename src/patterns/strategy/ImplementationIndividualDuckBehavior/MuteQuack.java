package patterns.strategy.ImplementationIndividualDuckBehavior;

import patterns.strategy.Interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
