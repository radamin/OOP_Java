package OOPhw04WarGames.weapons.meleeWeapon;

public class Sword implements Melee {

    @Override
    public int damage() {
        return 10;
    }
    @Override
    public String toString() {
        return String.format("Sword, Damage: %d",damage());
    }
}