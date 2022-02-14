package sectors.sec27.polimorfizm;

public class Person {
    private Animal animal;

    public void takeAnimal(Animal animal){
        this.animal = animal;
    }

    public void getAnimal(){
        if(animal != null){
            animal.getName();
        }else{
            System.out.println("Nie mam jeszcze zwierzęcia!");
        }
    }
}
