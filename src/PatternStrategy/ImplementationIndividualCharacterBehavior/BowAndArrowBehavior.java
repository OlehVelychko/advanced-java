package PatternStrategy.ImplementationIndividualCharacterBehavior;

import PatternStrategy.Interfaces.WeaponBehavior;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Реализация выстрела из лука");
    }
}
