package sectors.sec16.zad2;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        int[] tab = {1,22,13,-4, 13};
        TabOperator tabOperator1 = new TabOperator(tab);
        System.out.println(Arrays.toString(tabOperator1.getTab()));
        System.out.println("Suma: " + tabOperator1.sumaTab());
        System.out.println("Średnia: " + tabOperator1.averageTab());
        System.out.println("Max value: " + tabOperator1.maxValue());
        System.out.println("Min value: " + tabOperator1.minValue());
    }
}
