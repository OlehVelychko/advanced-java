package patterns.strategy.RealCharacters;

import patterns.strategy.Character;
import patterns.strategy.ImplementationIndividualCharacterBehavior.AxeBehavior;

public class Troll extends Character {
    public Troll() {
        weaponBehavior = new AxeBehavior();
    }
}
