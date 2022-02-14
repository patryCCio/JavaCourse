package sectors.sec11.zad9;

/*
8. Napisz program, w którym po podaniu liczby n narysujesz za pomocą * (gwiazdki) trójkąt prostokątny o przyprostokątnych składających się z n-razy * (gwiazdki) ;)
np. podając n = 5 powinniśmy otrzymać taki trójkąt:
    *
   **
  ***
 ****
*****
 */

public class Ex9 {
    public static void main(String[] args) {
        int n = 5;
        int helper = n-1;

        for(int x=0; x<n; x++){
            for(int y=0; y<n; y++){
                if(y==helper){
                    for(int z=y; z<n; z++){
                        System.out.print("*");
                    }
                    break;
                }
                else{
                    System.out.print(" ");
                }
            }
            helper--;
            System.out.println();
        }
    }
}
