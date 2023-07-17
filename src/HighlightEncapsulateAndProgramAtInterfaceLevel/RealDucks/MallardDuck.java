package HighlightEncapsulateAndProgramAtInterfaceLevel.RealDucks;

import HighlightEncapsulateAndProgramAtInterfaceLevel.Duck;
import HighlightEncapsulateAndProgramAtInterfaceLevel.DucksForImplementationVoids.FlyWithWings;
import HighlightEncapsulateAndProgramAtInterfaceLevel.DucksForImplementationVoids.Quack;

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
