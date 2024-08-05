package patterns.strategy.ImplementationIndividualCharacterBehavior;

import patterns.strategy.Interfaces.WeaponBehavior;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Реализация удара ножом");
    }
}
