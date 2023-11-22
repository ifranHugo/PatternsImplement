package abstractFactory.factories;

import abstractFactory.ClothesAbstractFactory;
import abstractFactory.products.Shirt;
import abstractFactory.products.Shoe;
import abstractFactory.products.Trousers;
import abstractFactory.products.shirt.SportShirt;
import abstractFactory.products.shoe.SportShoe;
import abstractFactory.products.trousers.SportTrousers;

public class SportClothesFactory implements ClothesAbstractFactory {
    @Override
    public Shoe createShoe() {
        return new SportShoe();
    }

    @Override
    public Shirt createShirt() {
        return new SportShirt();
    }

    @Override
    public Trousers createTrousers() {
        return new SportTrousers();
    }
}
