package composite.ExampleProduct;

public interface BoxProductComposite {


    void addItem(BoxProductComposite item);

    void removeItem(BoxProductComposite item);

    double getPrice();

    String getName();
    StringBuilder printAllChilldrens();


}
