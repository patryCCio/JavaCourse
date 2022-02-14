package sectors.sec11.zad7;

/*
7. Napisz program, w którym po podaniu liczby n narysujesz za pomocą * (gwiazdki) trójkąt prostokątny o przyprostokątnych składających się z n-razy * (gwiazdki) ;)
np. podając n = 5 powinniśmy otrzymać taki trójkąt:
*
**
***
****
*****
 */

public class Ex7 {
    public static void main(String[] args) {
        int n = 5;
        int helper = 0;
        for(int x=0; x<n; x++){
            helper++;
            for(int y=0; y<helper; y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
