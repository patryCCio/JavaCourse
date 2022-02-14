package sectors.sec11.zad6;

//Napisz program, który będzie obliczał silnię z nieujemnej liczby

public class Ex6 {
    public static void main(String[] args) {
        int n = 6;
        int result = 0;
        if(n==0){
            result = 1;
        }else if(n<0){
            System.out.println("Silnia nie może być z ujemnej liczby!");
        }else{
            result = 1;
            for(int x=1; x<=n; x++){
                result = result*x;
            }
            System.out.println("Silnia z liczby !" + n + ": " + result);
        }

    }
}
