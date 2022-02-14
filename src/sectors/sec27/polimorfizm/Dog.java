package sectors.sec27.polimorfizm;

public class Dog extends Ssak{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void getName() {
        System.out.println("Jestem psem! Nazywam się " + name + "!");
    }

    @Override
    public void getSound() {
        System.out.println("Hau hau hauu!");
    }
}
