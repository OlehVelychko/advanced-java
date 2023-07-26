package PatternStrategy.RealCharacters;

import PatternStrategy.Character;
import PatternStrategy.ImplementationIndividualCharacterBehavior.SwordBehavior;

public class King extends Character {
    public King() {
        weaponBehavior = new SwordBehavior();
    }
}
