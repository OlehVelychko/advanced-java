package patterns.strategy.RealDucks;

import patterns.strategy.Duck;
import patterns.strategy.ImplementationIndividualDuckBehavior.FlyNoWings;
import patterns.strategy.ImplementationIndividualDuckBehavior.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model Duck");
    }
}
