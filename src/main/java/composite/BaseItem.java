package composite;

import java.util.List;

public abstract class BaseItem {
    protected String name;
    protected double value;
    protected List<BaseItem> item;

    public BaseItem(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public abstract void addItem(BaseItem item);
    public abstract void removeItem(BaseItem item);

    public abstract double getValue();

}
