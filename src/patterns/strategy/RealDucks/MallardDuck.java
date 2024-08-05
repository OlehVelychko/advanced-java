package patterns.strategy.RealDucks;

import patterns.strategy.Duck;
import patterns.strategy.ImplementationIndividualDuckBehavior.FlyWithWings;
import patterns.strategy.ImplementationIndividualDuckBehavior.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("Hi! I'm a real Mallard Duck!");
    }
}
