package org.mpei.PracticWorkSololearn_1.Practic_3;

import java.util.List;
import java.util.Random;

public class DungeonsAndDragons {
    private static String species;
    private static String craft;
    private static int gold;
    private static String arsenal;
    private static int power;
    private static int intelligence;
    private static int dexterity;
    private static int charisma;
    private static int endurance;
    private static int stealth;
    private static int accuracy;
    private static int resistance_to_control;
    private static int luck;
    private static int magic;

    private static List<String> specieses = List.of(
            "Elf",
            "Gnome",
            "Undead",
            "Orc",
            "Vampire",
            "Succubus",
            "Human",
            "Golem",
            "Werewolf");
    private static List<String> crafts = List.of(
            "Assassin",
            "Paladin",
            "Archer",
            "Druid",
            "Hunter",
            "Bard",
            "Swordsman",
            "Necromancer",
            "Pyromancer",
            "Hydromag",
            "Geomag",
            "Shield",
            "Shaman",
            "Engineer",
            "Cook");
    private static List<String> arsenals = List.of(
            "Sword",
            "Dagger",
            "Stick",
            "Crossbow",
            "Pistol",
            "Hand cannon",
            "Heavy Shield",
            "Frying pan",
            "Guitar",
            "Whip",
            "Spear",
            "Axe",
            "Katana",
            "Hammer",
            "Hook",
            "Braid",
            "Fork",
            "No weapons"
    );

    public static void main(String[] args) {
        species = getSpecies();
        craft = getCraft();
        gold = getGold();
        arsenal = getArsenal(craft);
        power = getPoint();
        intelligence = getPoint();
        dexterity = getPoint();
        charisma = getPoint();
        endurance = getPoint();
        stealth = getPoint();
        accuracy = getPoint();
        resistance_to_control = getPoint();
        luck = getPoint();
        magic = getPoint();

        System.out.println("Расса: " + species);
        System.out.println("Ремесло: " + craft);
        System.out.println("Количество золотых монет: " + gold);
        System.out.println("Оружие: " + arsenal);
        System.out.println("Сила: " + power);
        System.out.println("Интеллект: " + intelligence);
        System.out.println("Ловкость: " + dexterity);
        System.out.println("Харизма: " + charisma);
        System.out.println("Выносливость: " + endurance);
        System.out.println("Скрытность: " + stealth);
        System.out.println("Точность: " + accuracy);
        System.out.println("Сопротивление к контролю: " + resistance_to_control);
        System.out.println("Удача: " + luck);
        System.out.println("Магия: " + magic);
    }

    public static String getSpecies() {
        Random random = new Random();
        String species = specieses.get(random.nextInt(specieses.size()));
        return species;
    }

    public static String getCraft() {
        Random random = new Random();
        String craft = crafts.get(random.nextInt(crafts.size()));
        return craft;
    }

    public static int getGold() {
        Random random = new Random();
        int gold = random.nextInt(10, 50);
        return gold;
    }

    public static String getArsenal(String craft) {
        Random random = new Random();
        String arsenal;
        switch (craft) {
            case ("Assassin"):
                arsenal = "Dagger";
                break;
            case ("Paladin"):
                arsenal = "Sword" + " and " + "Heavy Shield";
                break;
            case ("Hunter"):
                arsenal = "Pistol" + " and " + "Crossbow";
                break;
            case ("Archer"):
                arsenal = "Crossbow";
                break;
            case ("Swordsman"):
                arsenal = "Sword" + " and " + "Sword";
                break;
            case ("Druid"):
                arsenal = "Stick";
                break;
            case ("Shaman"):
                arsenal = "Stick" + " and " + "Whip";
                break;
            case ("Cook"):
                arsenal = "Fork" + " and " + "Hammer";
                break;
            default:
                arsenal = arsenals.get(random.nextInt(arsenals.size()));
        }
        return arsenal;
    }

    public static int getPoint() {
        Random random = new Random();
        int point = random.nextInt(20, 100);
        return point;
    }
}
