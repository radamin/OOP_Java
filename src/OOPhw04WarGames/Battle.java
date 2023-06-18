package OOPhw04WarGames;

import OOPhw04WarGames.shields.Shield;
import OOPhw04WarGames.warriors.Warrior;
import OOPhw04WarGames.weapons.Weapon;

public class Battle<W1 extends Weapon, S1 extends Shield , W2 extends Weapon, S2 extends Shield>{
    private final Warrior<W1, S1> w1;
    private final Warrior<W2, S2> w2;

    public Battle(Warrior<W1, S1> w1, Warrior<W2, S2> w2){
        this.w1 = w1;
        this.w2 = w2;
    }

    public void fight(){
        String firstName = w1.getName();
        String secondName = w2.getName();
        while ((w1.getHealthPoint() > 0) || (w2.getHealthPoint() > 0)){
            int damageFirst = w1.hit();
            int protectSecond = w2.protectByShield();
            System.out.printf("%s hit %s with damage: %d, %s's shield protected: %d\n",firstName,secondName, damageFirst,secondName,protectSecond);
            w2.reduceHealth(damageFirst, protectSecond);
            int damageSecond = w2.hit();
            int protectFirst = w1.protectByShield();
            if (w2.getHealthPoint() <= 0){
                System.out.printf("%s win, %s lost!\n", firstName, secondName);
                break;
            }
            w1.reduceHealth(damageSecond, protectFirst);
            System.out.printf("%s hit %s with damage: %d %s's shield protected: %d\n",secondName,firstName, damageSecond,firstName, protectFirst);
            if (w1.getHealthPoint() <= 0){
                System.out.printf("%s lost, %s win!\n", firstName, secondName);
                break;
            }
            System.out.printf("%s hp: %d, %s hp: %d\n",firstName, w1.getHealthPoint(),secondName, w2.getHealthPoint());
        }
    }

}