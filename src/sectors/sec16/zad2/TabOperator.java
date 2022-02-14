package sectors.sec16.zad2;

public class TabOperator {
    private int tablica[];

    public TabOperator(int[] tab) {
        tablica = tab;
    }

    public int[] getTab(){
        return tablica;
    }

    public int sumaTab(){
        int result = 0;
        for (int i : tablica) {
            result += i;
        }
        return result;
    }

    public int averageTab(){
        int result = 0;
        for (int i :
                tablica) {
            result += i;
        }
        return result/tablica.length;
    }

    public int maxValue(){
        int helper = tablica[0];
        for(int i: tablica){
            if(i>helper)helper = i;
        }
        return helper;
    }

    public int minValue(){
        int helper = tablica[0];
        for(int i: tablica){
            if(i<helper)helper = i;
        }
        return helper;
    }

}
