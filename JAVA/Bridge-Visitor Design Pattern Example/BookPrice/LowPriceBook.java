package BookPrice;

public class LowPriceBook implements BookPrice {

    @Override
    public double getPrice() {
        return 10;
    }
}
