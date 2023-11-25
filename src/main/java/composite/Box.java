package composite;

public class Box extends BaseItem
{
    public Box(String name ) {
        super(name, 0);
    }

    @Override
    public void addItem(BaseItem item) {
        this.item.add(item);
    }

    @Override
    public void removeItem(BaseItem item) {
        this.item.remove(item);
    }

    @Override
    public double getValue() {
        double result = value;
        for (BaseItem item : this.item) {
            result += item.getValue();
        }
        return result;

    }
}
