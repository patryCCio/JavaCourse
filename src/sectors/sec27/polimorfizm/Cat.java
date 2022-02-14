package sectors.sec27.polimorfizm;

public class Cat extends Ssak{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void getName() {
        System.out.println("Jestem kotem! Nazywam się " + name + "!");
    }

    @Override
    public void getSound() {
        System.out.println("Meow meow meow!");
    }
}
