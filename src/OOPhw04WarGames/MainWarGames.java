package OOPhw04WarGames;

import OOPhw04WarGames.shields.BigShield;
import OOPhw04WarGames.shields.HandShield;
import OOPhw04WarGames.warriors.Archer;
import OOPhw04WarGames.warriors.Infantry;
import OOPhw04WarGames.weapons.meleeWeapon.Axe;
import OOPhw04WarGames.weapons.meleeWeapon.Sword;
import OOPhw04WarGames.weapons.rangedWeapon.Bow;
import OOPhw04WarGames.weapons.rangedWeapon.CrossBow;

@SuppressWarnings("ALL")
public class MainWarGames {
    public static void main(String[] args) {
        Infantry infantry = new Infantry("Rob", 10, new Sword(), new BigShield());
        Infantry axeInfantry = new Infantry("Bob", 10, new Axe(), new BigShield());
        Infantry swordInfantry = new Infantry("Zob", 10, new Sword(), new BigShield());
        Archer archer = new Archer("Rod", 30, new Bow(), new HandShield());
        Archer bowArcher = new Archer("Bod", 31, new Bow(), new HandShield());
        Archer crossBowArcher = new Archer("Zod", 50, new CrossBow(), new HandShield());

        Team<OOPhw04WarGames.warriors.Warrior> team1 = new Team<>();
        team1.add(infantry);
        team1.add(archer);
        team1.add(new Infantry("Who", 150, new Axe(), new BigShield()));

        Team<Archer> archers = new Team<>();
        archers.add(bowArcher);
        archers.add(crossBowArcher);
        archers.add(new Archer("Nod", 45, new CrossBow(), new HandShield()));

        Team<Infantry> infantries = new Team<>();
        infantries.add(axeInfantry);
        infantries.add(swordInfantry);
        infantries.add(new Infantry("Nob", 90, new Axe(), new BigShield()));

        System.out.println(team1);
        System.out.println("*************************");
        System.out.println(archers);
        System.out.println("*************************");
        System.out.println(infantries);
        System.out.println("*************************");

        Battle<OOPhw04WarGames.weapons.meleeWeapon.Melee, OOPhw04WarGames.shields.FullShield, OOPhw04WarGames.weapons.meleeWeapon.Melee, OOPhw04WarGames.shields.FullShield> fight1 = new Battle<>(axeInfantry, swordInfantry);
        fight1.fight();

    }
}