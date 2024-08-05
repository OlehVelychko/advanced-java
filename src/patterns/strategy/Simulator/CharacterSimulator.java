package patterns.strategy.Simulator;

import patterns.strategy.Character;
import patterns.strategy.ImplementationIndividualCharacterBehavior.BowAndArrowBehavior;
import patterns.strategy.RealCharacters.Queen;
import patterns.strategy.RealCharacters.Troll;

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
