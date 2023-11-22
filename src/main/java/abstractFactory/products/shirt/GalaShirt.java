package abstractFactory.products.shirt;

import abstractFactory.products.Shirt;

public class GalaShirt implements Shirt {
    @Override
    public boolean hasLongSleeves() {
        return true;
    }

    @Override
    public boolean hasButtons() {
        return true;
    }
}
