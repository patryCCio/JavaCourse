package sectors.sec11.zad8;

/*
8. Napisz program, w którym po podaniu liczby n narysujesz za pomocą * (gwiazdki) trójkąt prostokątny o przyprostokątnych składających się z n-razy * (gwiazdki) ;)
np. podając n = 5 powinniśmy otrzymać taki trójkąt:
*****
****
***
**
*
 */

public class Ex8 {
    public static void main(String[] args) {
        int n = 10;
        int helper = n;
        for(int x=n; x>=0; x--){
            helper--;
            for(int y=helper; y>=0; y--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
