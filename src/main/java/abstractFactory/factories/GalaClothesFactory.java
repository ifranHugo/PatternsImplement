package abstractFactory.factories;

import abstractFactory.ClothesAbstractFactory;
import abstractFactory.products.Shirt;
import abstractFactory.products.Shoe;
import abstractFactory.products.Trousers;
import abstractFactory.products.shirt.GalaShirt;
import abstractFactory.products.shoe.GalaShoe;
import abstractFactory.products.trousers.GalaTrousers;

public class GalaClothesFactory implements ClothesAbstractFactory {
    @Override
    public Shoe createShoe() {
        return new GalaShoe();
    }

    @Override
    public Shirt createShirt() {
        return new GalaShirt();
    }

    @Override
    public Trousers createTrousers() {
        return new GalaTrousers();
    }
}
