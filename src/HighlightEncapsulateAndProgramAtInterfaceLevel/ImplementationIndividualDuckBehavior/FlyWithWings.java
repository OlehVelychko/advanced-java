package HighlightEncapsulateAndProgramAtInterfaceLevel.ImplementationIndividualDuckBehavior;

import HighlightEncapsulateAndProgramAtInterfaceLevel.Interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying...!!!");
    }
}
