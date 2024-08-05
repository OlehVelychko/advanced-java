package patterns.strategy.Simulator;

import patterns.strategy.Duck;
import patterns.strategy.ImplementationIndividualDuckBehavior.FlyRocketPowered;
import patterns.strategy.RealDucks.MallardDuck;
import patterns.strategy.RealDucks.ModelDuck;

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
