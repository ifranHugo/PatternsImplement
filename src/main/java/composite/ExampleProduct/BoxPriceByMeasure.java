package composite.ExampleProduct;

public enum BoxPriceByMeasure {
    SMALL(30),
    MEDIUM(60),
    LARGE(120);
    private double price;
    BoxPriceByMeasure(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
}
