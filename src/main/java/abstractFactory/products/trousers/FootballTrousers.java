package abstractFactory.products.trousers;

import abstractFactory.products.Trousers;

public class FootballTrousers implements Trousers{
    @Override
    public boolean isShorts() {
        return true;
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
