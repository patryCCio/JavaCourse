package sectors.sec21.klasaabstrakcyjna.example;

public abstract class Character {

    public String nameCharacter;

    Character(String nameCharacter){
        this.nameCharacter = nameCharacter;
    }


public abstract int hp();
public abstract int mana();
public abstract int agility();

}
