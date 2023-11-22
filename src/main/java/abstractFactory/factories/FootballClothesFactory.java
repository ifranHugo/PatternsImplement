package abstractFactory.factories;

import abstractFactory.ClothesAbstractFactory;
import abstractFactory.products.Shirt;
import abstractFactory.products.Shoe;
import abstractFactory.products.Trousers;
import abstractFactory.products.shirt.FootballShirt;
import abstractFactory.products.shoe.FootbalShoes;
import abstractFactory.products.trousers.FootballTrousers;

public class FootballClothesFactory implements ClothesAbstractFactory {
    @Override
    public Shoe createShoe() {
        return new FootbalShoes();
    }

    @Override
    public Shirt createShirt() {
        return new FootballShirt();
    }

    @Override
    public Trousers createTrousers() {
        return new FootballTrousers();
    }
}
