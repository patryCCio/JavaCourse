package sectors.sec21.klasaanonimowa;

public class Main {
    public static void main(String[] args) {
        NormalClass normalClass2 = new NormalClass();

        NormalClass normalClass = new NormalClass(){
            @Override
            public void normalMethod() {
                System.out.println("Hello!");
            }
        };
        normalClass.normalMethod();
        normalClass2.normalMethod();

        printInfo(normalClass);
        printInfo(normalClass2);
        printInfo(new NormalClass(){
            @Override
            public void normalMethod() {
                System.out.println("Witaj!");
            }
        });
    }

    public static void printInfo(NormalClass parametr){
        parametr.normalMethod();
    }
}
