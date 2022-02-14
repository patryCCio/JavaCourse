package sectors.sec28.thirdVideoConstructor;

public class Main {
    public static void main(String[] args) {
        printAllPizza();
    }

    private static void printAllPizza(){
        Pizza[] pizza = Pizza.values();
        for(int x=0; x< pizza.length; x++){
            printInfo(pizza[x]);
        }
    }

    private static void printInfo(Pizza pizza) {
        System.out.println("pizza " + pizza + " (" + pizza.size + " cm), cena: " + pizza.price + " zł");
    }
}
