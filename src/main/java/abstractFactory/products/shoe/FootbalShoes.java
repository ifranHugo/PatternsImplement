package abstractFactory.products.shoe;

import abstractFactory.products.Shoe;

public class FootbalShoes implements Shoe {

    @Override
    public boolean isEleganShoes() {
        return false;
    }

    @Override
    public boolean isRunningShoes() {
        return false;
    }

    @Override
    public boolean isFootballCleas() {
        return true;
    }
}
