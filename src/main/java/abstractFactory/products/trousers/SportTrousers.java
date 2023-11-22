package abstractFactory.products.trousers;

import abstractFactory.products.Trousers;

public class SportTrousers implements Trousers {

    @Override
    public boolean isShorts() {
        return false;
    }

    @Override
    public boolean isJeans() {
        return false;
    }

    @Override
    public boolean isSport() {
        return true;
    }
}
