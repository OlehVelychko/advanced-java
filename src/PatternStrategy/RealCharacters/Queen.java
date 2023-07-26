package PatternStrategy.RealCharacters;

import PatternStrategy.Character;
import PatternStrategy.ImplementationIndividualCharacterBehavior.KnifeBehavior;

public class Queen extends Character {
    public Queen() {
        weaponBehavior = new KnifeBehavior();
    }
}
