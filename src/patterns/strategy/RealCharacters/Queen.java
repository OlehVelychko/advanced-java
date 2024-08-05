package patterns.strategy.RealCharacters;

import patterns.strategy.Character;
import patterns.strategy.ImplementationIndividualCharacterBehavior.KnifeBehavior;

public class Queen extends Character {
    public Queen() {
        weaponBehavior = new KnifeBehavior();
    }
}
