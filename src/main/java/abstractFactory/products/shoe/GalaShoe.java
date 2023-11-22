package abstractFactory.products.shoe;

import abstractFactory.products.Shoe;

public class GalaShoe implements Shoe {
        @Override
        public boolean isEleganShoes() {
            return true;
        }

        @Override
        public boolean isRunningShoes() {
            return false;
        }

        @Override
        public boolean isFootballCleas() {
            return false;
        }
}
