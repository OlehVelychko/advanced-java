package patterns.strategy.ImplementationIndividualCharacterBehavior;

import patterns.strategy.Interfaces.WeaponBehavior;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Реализация выстрела из лука");
    }
}
