package OOPhw04WarGames.weapons.meleeWeapon;

public class Axe implements Melee {
    @Override
    public int damage() {
        return 7;
    }

    @Override
    public String toString() {
        return String.format("Axe, Damage: %d",damage());
    }
}