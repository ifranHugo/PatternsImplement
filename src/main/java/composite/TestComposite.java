package composite;

public class TestComposite {
    public static void main(String[] args) {
        BaseItem inventario = new Box("Inventario");

        BaseItem armas = new Box("Bag coins");

        BaseItem espada = new Box("Medical kit");

        BaseItem pocion = new Item("Pocion", 10);
    }
}
