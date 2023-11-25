package dependecyInjection.cellInjection;

public class Main {

    public static void main(String[] args) {

        Cell c1 = new Cell("Moto G41",new Battery(2931,"IBEK","2022"));

        Chip intel = new Chip("intel",13913);
        Chip tigo = new Chip("tigo",11941);
        c1.agregarChip(intel);
        c1.agregarChip(tigo);

        System.out.println(c1.toString());


    }
}
