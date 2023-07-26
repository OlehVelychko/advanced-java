package PatternStrategy.RealCharacters;

import PatternStrategy.Character;
import PatternStrategy.ImplementationIndividualCharacterBehavior.BowAndArrowBehavior;

public class Knight extends Character {
    public Knight() {
        weaponBehavior = new BowAndArrowBehavior();
    }
}
