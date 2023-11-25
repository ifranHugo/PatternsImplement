package composite.ExampleProduct;

public class Product implements BoxProductComposite{
        protected String name;
        protected double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }
        @Override
        public void addItem(BoxProductComposite item) {
            System.out.println("Can't add item to product");
            throw new UnsupportedOperationException();
        }

        @Override
        public void removeItem(BoxProductComposite item) {
            System.out.println("Can't remove item to product");
            throw new UnsupportedOperationException();
        }
        @Override
        public double getPrice() {
            return this.price;
        }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public StringBuilder printAllChilldrens() {
        StringBuilder resultado = new StringBuilder();
        return resultado.append("");
    }


}
