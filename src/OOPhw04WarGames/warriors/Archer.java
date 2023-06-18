package OOPhw04WarGames.warriors;

import OOPhw04WarGames.shields.ForearmShield;
import OOPhw04WarGames.weapons.rangedWeapon.Range;

public class Archer extends Warrior<Range, ForearmShield>{
    public Archer(String name, int healthPoint, Range weapon, ForearmShield shield) {
        super(name, healthPoint, weapon, shield);
    }

    public int distance(){
        return (super.getWeapon()).distance();
    }


    @Override
    public String toString() {
        return String.format("Archer: %s, Distance: %d", super.toString(), distance());
    }
}