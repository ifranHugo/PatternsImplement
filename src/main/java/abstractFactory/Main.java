package abstractFactory;

import abstractFactory.factories.SportClothesFactory;
import abstractFactory.products.Shoe;
import abstractFactory.products.Trousers;
import abstractFactory.products.shirt.SportShirt;

public class Main {
    public static void main(String[] args) {
        ClothesAbstractFactory SportClothesFactory = new SportClothesFactory();
        Shoe SportShoe= SportClothesFactory.createShoe();
        SportShirt SportShirt = (SportShirt) SportClothesFactory.createShirt();
        Trousers SportTrousers = SportClothesFactory.createTrousers();


    }
}
