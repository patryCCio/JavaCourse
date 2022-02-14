package sectors.sec5.zad2;

public class Ex2 {
    public static void main(String[] args) {
        int age = 21;
        double height = 1.83;
        int scales = 85;

        String result = "Wiek: " + age + ", wysokość: " + height + "m, waga: " + scales + "kg.";

        System.out.println(result);
        System.out.println("BMI: " + (scales/(height*height)));

    }
}
