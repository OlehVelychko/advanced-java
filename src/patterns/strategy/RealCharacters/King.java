package patterns.strategy.RealCharacters;

import patterns.strategy.Character;
import patterns.strategy.ImplementationIndividualCharacterBehavior.SwordBehavior;

public class King extends Character {
    public King() {
        weaponBehavior = new SwordBehavior();
    }
}
