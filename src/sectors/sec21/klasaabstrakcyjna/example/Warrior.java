package sectors.sec21.klasaabstrakcyjna.example;

public class Warrior extends Character{

    public String classCharacter = "Warrior";

    Warrior(String nameCharacter) {
        super(nameCharacter);
    }

    @Override
    public int hp() {
        return 300;
    }

    @Override
    public int mana() {
        return 120;
    }

    @Override
    public int agility() {
        return 220;
    }
}
