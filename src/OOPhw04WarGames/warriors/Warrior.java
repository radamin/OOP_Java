package OOPhw04WarGames.warriors;

import OOPhw04WarGames.shields.Shield;
import OOPhw04WarGames.weapons.Weapon;
import java.util.Random;

@SuppressWarnings("ALL")
public abstract class Warrior<W extends Weapon, S extends Shield> {
    private final String name;
    private int healthPoint;
    private final W weapon;
    private final S shield;

    public Warrior(String name, int healthPoint, W weapon, S shield) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.shield = shield;
    }

    public String getName() {
        return name;
    }
    public W getWeapon() {
        return weapon;
    }
    public int getHealthPoint() {
        return healthPoint;
    }
    public S getShield() {
        return shield;
    }


    public int hit(){
        Random rand = new Random();
        return rand.nextInt(0, weapon.damage() + 1);
    }

    public void reduceHealth(int damage, int protectbyShield){
        if (protectbyShield >= damage) {
        }
        else {
            healthPoint -= (damage - protectbyShield);
        }
        if (healthPoint < 0) {
            healthPoint = 0;
        }
    }


    public int protectByShield(){
        Random rand = new Random();
        int shildProtect = rand.nextInt(0, shield.protect() + 1);
        return shildProtect;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Hp: %d, Weapon: %s, Shield: %s", name, healthPoint, weapon, shield);
    }
}