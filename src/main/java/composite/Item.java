package composite;

public class Item extends BaseItem{
    public Item(String name, double value) {
        super(name, value);
    }

    @Override
    public void addItem(BaseItem item) {
        System.out.println("No se puede agregar un item a un item");
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removeItem(BaseItem item) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double getValue() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
