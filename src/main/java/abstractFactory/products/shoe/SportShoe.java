package abstractFactory.products.shoe;

import abstractFactory.products.Shoe;

public class SportShoe implements Shoe {

    @Override
    public boolean isEleganShoes() {
        return false;
    }

    @Override
    public boolean isRunningShoes() {
        return true;
    }

    @Override
    public boolean isFootballCleas() {
        return false;
    }
}
