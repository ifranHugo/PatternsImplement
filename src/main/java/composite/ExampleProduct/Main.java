package composite.ExampleProduct;

public class Main {
    public static void main(String[] args) {

        BoxProductComposite box = new Box("Box", BoxPriceByMeasure.SMALL);
        BoxProductComposite box2 = new Box("Box2", BoxPriceByMeasure.MEDIUM);
        BoxProductComposite box3 = new Box("Box3", BoxPriceByMeasure.LARGE);
        box3.addItem(box2);
        box3.addItem(box);
        Product product = new Product("Television", 1500);
        Product product2 = new Product("PlayStation", 2000);
        box.addItem(product2);
        box2.addItem(product);
        System.out.println("Box price: " + box.getPrice());
        System.out.println("Box2 price: " + box2.getPrice());

        System.out.println("Box3 chilldrens: "+box3.printAllChilldrens());
    }
}
