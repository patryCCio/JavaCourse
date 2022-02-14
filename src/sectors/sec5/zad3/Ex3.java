package sectors.sec5.zad3;

public class Ex3 {
    public static void main(String[] args) {
        int age = 21;
        double height = 1.83;
        int scales = 85;

        String result = "Wiek: " + age + ", wysokość: " + height + "m, waga: " + scales + "kg.";

        System.out.println(result);
        double bmiResult = scales/(height*height);
        System.out.println("BMI: " + bmiResult);
        System.out.println("Converted to int: " + (int)bmiResult);

    }
}
