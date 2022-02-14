package sectors.sec11.zad5;

public class Ex5 {
    public static void main(String[] args) {
        int[] tab = new int[10];

        for(int x=0; x<10; x++){
            tab[x] = x;
        }

        int result = 0;

        for(int x=0; x<10; x++){
            result += tab[x];
        }
        System.out.println("Result: " + result);
    }
}
