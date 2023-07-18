package HighlightEncapsulateAndProgramAtInterfaceLevel.RealCharacters;

import HighlightEncapsulateAndProgramAtInterfaceLevel.Character;
import HighlightEncapsulateAndProgramAtInterfaceLevel.ImplementationIndividualCharacterBehavior.BowAndArrowBehavior;

public class Knight extends Character {
    public Knight() {
        weaponBehavior = new BowAndArrowBehavior();
    }
}
