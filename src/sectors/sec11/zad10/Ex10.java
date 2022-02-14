package sectors.sec11.zad10;

public class Ex10 {
    public static void main(String[] args) {
        int n=5;
        int helper = (2*n)-1;
        int liczbaGwiazdek = 1;
        int z=1;
        for(int x=0; x<n; x++){
            for(int y=0; y<helper; y++){
                if(y==(n-z)){
                    for(int j=0; j<liczbaGwiazdek; j++){
                        System.out.print("*");
                    }
                }else{
                    System.out.print(" ");
                }
            }
            z++;
            liczbaGwiazdek += 2;
            System.out.println();
        }
    }
}
