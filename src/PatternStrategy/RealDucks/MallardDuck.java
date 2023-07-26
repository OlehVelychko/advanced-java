package PatternStrategy.RealDucks;

import PatternStrategy.Duck;
import PatternStrategy.ImplementationIndividualDuckBehavior.FlyWithWings;
import PatternStrategy.ImplementationIndividualDuckBehavior.Quack;

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
