package HighlightEncapsulateAndProgramAtInterfaceLevel;

import HighlightEncapsulateAndProgramAtInterfaceLevel.DucksForImplementationVoids.FlyRocketPowered;
import HighlightEncapsulateAndProgramAtInterfaceLevel.DucksForImplementationVoids.MuteQuack;
import HighlightEncapsulateAndProgramAtInterfaceLevel.RealDucks.MallardDuck;
import HighlightEncapsulateAndProgramAtInterfaceLevel.RealDucks.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

    }
}
