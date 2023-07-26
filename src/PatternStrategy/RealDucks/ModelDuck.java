package PatternStrategy.RealDucks;

import PatternStrategy.Duck;
import PatternStrategy.ImplementationIndividualDuckBehavior.FlyNoWings;
import PatternStrategy.ImplementationIndividualDuckBehavior.Quack;

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
