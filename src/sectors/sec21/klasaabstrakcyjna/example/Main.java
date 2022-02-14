package sectors.sec21.klasaabstrakcyjna.example;

public class Main {
    public static void main(String[] args) {
        Wizard wizard = new Wizard("Janusz Magik" );
        printInfo("Name: " + wizard.nameCharacter, wizard.classCharacter, wizard.hp(), wizard.mana(), wizard.agility(), wizard);

        Warrior warrior = new Warrior("Janusz Wojownik" );
        printInfo("Name: " + warrior.nameCharacter, warrior.classCharacter, warrior.hp(), warrior.mana(), warrior.agility(), wizard);
    }

    private static void printInfo(String s, String classCharacter, int hp, int mana, int agility, Wizard wizard) {
        System.out.println(s);
        System.out.println("Class: " + classCharacter);
        System.out.println("Hp: " + hp);
        System.out.println("Mana: " + mana);
        System.out.println("Agi: " + agility);
    }
}
