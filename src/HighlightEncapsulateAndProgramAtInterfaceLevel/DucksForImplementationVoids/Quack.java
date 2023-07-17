package HighlightEncapsulateAndProgramAtInterfaceLevel.DucksForImplementationVoids;

import HighlightEncapsulateAndProgramAtInterfaceLevel.Interfaces.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
