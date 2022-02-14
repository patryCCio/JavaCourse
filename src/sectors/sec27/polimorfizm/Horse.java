package sectors.sec27.polimorfizm;

public class Horse extends Ssak{
    public Horse(String name) {
        super(name);
    }

    @Override
    public void getName() {
        System.out.println("Jestem koniem! Nazywam się " + name + "!");
    }

    @Override
    public void getSound() {
        System.out.println("Ihaou ihaou ihaou!");
    }
}
