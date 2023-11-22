package abstractFactory.products.shirt;

import abstractFactory.products.Shirt;

public class SportShirt implements Shirt {
    @Override
    public boolean hasLongSleeves() {
        return false;
    }

    @Override
    public boolean hasButtons() {
        return false;
    }
}
