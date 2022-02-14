package sectors.sec9.zad2;

public class Ex2 {
    public static void main(String[] args) {
        int yearSalary = 90000;
        double vat = 0;


        if(yearSalary < 85528){
            vat = 0.17;
            System.out.println("Musi zapłacić " + yearSalary * vat);
        }else if(yearSalary<0){
            System.out.println("Co kurwa?!");
        }else{
                vat = 0.17;
                double resultVat = yearSalary * vat;
                int moreThanBorder = yearSalary - 85528;
                resultVat = resultVat + (moreThanBorder*0.32);
            System.out.println("Musi zapłacić " + resultVat);
            }
        }
}

