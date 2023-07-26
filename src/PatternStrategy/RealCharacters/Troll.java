package PatternStrategy.RealCharacters;

import PatternStrategy.Character;
import PatternStrategy.ImplementationIndividualCharacterBehavior.AxeBehavior;

public class Troll extends Character {
    public Troll() {
        weaponBehavior = new AxeBehavior();
    }
}
