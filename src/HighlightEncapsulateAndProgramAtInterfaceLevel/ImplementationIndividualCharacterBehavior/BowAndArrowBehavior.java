package HighlightEncapsulateAndProgramAtInterfaceLevel.ImplementationIndividualCharacterBehavior;

import HighlightEncapsulateAndProgramAtInterfaceLevel.Interfaces.WeaponBehavior;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Реализация выстрела из лука");
    }
}
