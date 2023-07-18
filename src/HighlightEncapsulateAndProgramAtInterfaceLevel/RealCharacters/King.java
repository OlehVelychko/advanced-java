package HighlightEncapsulateAndProgramAtInterfaceLevel.RealCharacters;

import HighlightEncapsulateAndProgramAtInterfaceLevel.Character;
import HighlightEncapsulateAndProgramAtInterfaceLevel.ImplementationIndividualCharacterBehavior.SwordBehavior;

public class King extends Character {
    public King() {
        weaponBehavior = new SwordBehavior();
    }
}
