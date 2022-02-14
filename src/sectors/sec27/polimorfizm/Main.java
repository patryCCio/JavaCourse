package sectors.sec27.polimorfizm;

import sectors.sec18.zad1.Osoba;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Dog dog = new Dog("Burek");
        person.takeAnimal(dog);
        person.getAnimal();
    }
}
