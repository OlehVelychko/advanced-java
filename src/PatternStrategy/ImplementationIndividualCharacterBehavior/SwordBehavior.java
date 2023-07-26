package PatternStrategy.ImplementationIndividualCharacterBehavior;

import PatternStrategy.Interfaces.WeaponBehavior;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Реализация удара мечом");
    }
}
