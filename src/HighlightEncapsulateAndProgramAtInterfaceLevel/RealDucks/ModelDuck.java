package HighlightEncapsulateAndProgramAtInterfaceLevel.RealDucks;

import HighlightEncapsulateAndProgramAtInterfaceLevel.Duck;
import HighlightEncapsulateAndProgramAtInterfaceLevel.DucksForImplementationVoids.FlyNoWings;
import HighlightEncapsulateAndProgramAtInterfaceLevel.DucksForImplementationVoids.Quack;

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
