package sectors.sec21.example;

public class OuterClass {
    int outerMethod(){
        return  - 1;
    }

    class innerClass{
        int innerField;

        int innerMethod(){
            outerMethod();

            return -2;
        }
    }
}
