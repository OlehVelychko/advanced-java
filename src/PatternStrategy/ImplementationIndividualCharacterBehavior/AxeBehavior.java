package PatternStrategy.ImplementationIndividualCharacterBehavior;

import PatternStrategy.Interfaces.WeaponBehavior;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Реализация удара топором");
    }
}
