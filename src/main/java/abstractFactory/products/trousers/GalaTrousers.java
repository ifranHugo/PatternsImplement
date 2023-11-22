package abstractFactory.products.trousers;

import abstractFactory.products.Trousers;

public class GalaTrousers implements Trousers{

    @Override
    public boolean isShorts() {
        return false;
    }

    @Override
    public boolean isJeans() {
        return true;
    }

    @Override
    public boolean isSport() {
        return false;
    }
}
