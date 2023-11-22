package abstractFactory;

import abstractFactory.products.Shirt;
import abstractFactory.products.Shoe;
import abstractFactory.products.Trousers;

public interface ClothesAbstractFactory {

    Shoe createShoe();
    Shirt createShirt();
    Trousers createTrousers();
}
