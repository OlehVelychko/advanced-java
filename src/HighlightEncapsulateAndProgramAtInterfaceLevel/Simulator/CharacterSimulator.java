package HighlightEncapsulateAndProgramAtInterfaceLevel.Simulator;

import HighlightEncapsulateAndProgramAtInterfaceLevel.Character;
import HighlightEncapsulateAndProgramAtInterfaceLevel.ImplementationIndividualCharacterBehavior.BowAndArrowBehavior;
import HighlightEncapsulateAndProgramAtInterfaceLevel.RealCharacters.Queen;
import HighlightEncapsulateAndProgramAtInterfaceLevel.RealCharacters.Troll;

public class CharacterSimulator {
    public static void main(String[] args) {
        Character character1 = new Queen();
        character1.fight();
        System.out.println();

        Character character2 = new Troll();
        character2.fight();
        System.out.println();

        character1.setWeapon(new BowAndArrowBehavior());
        character1.fight();
    }
}
