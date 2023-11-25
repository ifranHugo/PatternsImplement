package composite.ExampleProduct;
import java.util.ArrayList;
import java.util.List;

public class Box implements BoxProductComposite{

    protected String name;
    protected double price;
    protected BoxPriceByMeasure measure;
    protected List<BoxProductComposite> items;
    public Box(String name, BoxPriceByMeasure measure) {
        this.name = name;
        this.measure = measure;
        this.price = measure.getPrice();
        this.items = new ArrayList<>();

    }
    @Override
    public void addItem(BoxProductComposite item) {
        this.items.add(item);
    }

    @Override
    public void removeItem(BoxProductComposite item) {
        this.items.remove(item);

    }
    protected BoxPriceByMeasure getMeasure() {
        return measure;
    }
    @Override
    public double getPrice() {
        try {
            double result = this.price;
            for (BoxProductComposite items : this.items) {
                result+= items.getPrice();
            }
            return result;
        } catch (Exception e) {
            System.out.println("Can't get price");
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public StringBuilder printAllChilldrens() {
        StringBuilder result = new StringBuilder();
        for (BoxProductComposite items : this.items) {
            result.append(items.getName()+"-->"+items.printAllChilldrens());
        }
        return result;
    }
}
