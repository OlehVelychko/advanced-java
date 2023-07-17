package HighlightEncapsulateAndProgramAtInterfaceLevel;

import HighlightEncapsulateAndProgramAtInterfaceLevel.Interfaces.FlyBehavior;
import HighlightEncapsulateAndProgramAtInterfaceLevel.Interfaces.QuackBehavior;

public abstract class Duck {
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("I'm swimming, swimming...!");
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}
