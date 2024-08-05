package patterns.strategy.RealCharacters;

import patterns.strategy.Character;
import patterns.strategy.ImplementationIndividualCharacterBehavior.BowAndArrowBehavior;

public class Knight extends Character {
    public Knight() {
        weaponBehavior = new BowAndArrowBehavior();
    }
}
