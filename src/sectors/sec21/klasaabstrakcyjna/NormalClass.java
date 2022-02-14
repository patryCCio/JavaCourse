package sectors.sec21.klasaabstrakcyjna;

public class NormalClass extends AbstractClass{
    @Override
    public void abstractMethod() {
        System.out.println("Hello normal class!");
    }

    @Override
    public int methodWithArgument(String arg) {
        System.out.println("Argument: " + arg);
        return 2021;
    }
}
