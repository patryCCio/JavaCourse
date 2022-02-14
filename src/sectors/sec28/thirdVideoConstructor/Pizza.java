package sectors.sec28.thirdVideoConstructor;

public enum Pizza {
    SMALL(20, 19.99),
    BIG(32, 27.99),
    FAMILY(42, 32.99),
    XXL(52, 38.99);

    public int size;
    public double price;

    Pizza(int size, double price){
        this.size = size;
        this.price = price;
    }
}
