package HighlightEncapsulateAndProgramAtInterfaceLevel.RealCharacters;

import HighlightEncapsulateAndProgramAtInterfaceLevel.Character;
import HighlightEncapsulateAndProgramAtInterfaceLevel.ImplementationIndividualCharacterBehavior.KnifeBehavior;

public class Queen extends Character {
    public Queen() {
        weaponBehavior = new KnifeBehavior();
    }
}
