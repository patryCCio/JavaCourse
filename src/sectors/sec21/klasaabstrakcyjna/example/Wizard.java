package sectors.sec21.klasaabstrakcyjna.example;

public class Wizard extends Character{
    public String classCharacter = "Wizard";

    Wizard(String nameCharacter) {
        super(nameCharacter);
    }

    @Override
    public int hp() {
        return 150;
    }

    @Override
    public int mana() {
        return 350;
    }

    @Override
    public int agility() {
        return 200;
    }
}
