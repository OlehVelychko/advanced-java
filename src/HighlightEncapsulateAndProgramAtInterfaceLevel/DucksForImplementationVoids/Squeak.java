package HighlightEncapsulateAndProgramAtInterfaceLevel.DucksForImplementationVoids;

import HighlightEncapsulateAndProgramAtInterfaceLevel.Interfaces.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
