package PatternStrategy.Simulator;

import PatternStrategy.Character;
import PatternStrategy.ImplementationIndividualCharacterBehavior.BowAndArrowBehavior;
import PatternStrategy.RealCharacters.Queen;
import PatternStrategy.RealCharacters.Troll;

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
