package HighlightEncapsulateAndProgramAtInterfaceLevel.RealDucks;

import HighlightEncapsulateAndProgramAtInterfaceLevel.Duck;
import HighlightEncapsulateAndProgramAtInterfaceLevel.ImplementationIndividualDuckBehavior.FlyNoWings;
import HighlightEncapsulateAndProgramAtInterfaceLevel.ImplementationIndividualDuckBehavior.Quack;

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
