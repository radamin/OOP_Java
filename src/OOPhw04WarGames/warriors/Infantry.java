package OOPhw04WarGames.warriors;

import OOPhw04WarGames.shields.FullShield;
import OOPhw04WarGames.weapons.meleeWeapon.Melee;

public class Infantry extends Warrior<Melee, FullShield>{
    public Infantry(String name, int healthPoint, Melee weapon, FullShield shield) {
        super(name, healthPoint, weapon, shield);
    }

    @Override
    public String toString() {
        return String.format("Infantry: %s",super.toString());
    }
}