package HighlightEncapsulateAndProgramAtInterfaceLevel.RealCharacters;

import HighlightEncapsulateAndProgramAtInterfaceLevel.Character;
import HighlightEncapsulateAndProgramAtInterfaceLevel.ImplementationIndividualCharacterBehavior.AxeBehavior;

public class Troll extends Character {
    public Troll() {
        weaponBehavior = new AxeBehavior();
    }
}
