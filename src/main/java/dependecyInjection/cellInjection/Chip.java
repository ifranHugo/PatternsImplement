package dependecyInjection.cellInjection;

public class Chip {
    int nroChip;
    String name;
    public Chip (String name,int nroChip) {
    this.name = name;
    this.nroChip = nroChip;

    }

    @Override
    public String toString() {
        return "Chip{" +
                "nroChip=" + nroChip +
                ", name='" + name + '\'' +
                '}';
    }
}
