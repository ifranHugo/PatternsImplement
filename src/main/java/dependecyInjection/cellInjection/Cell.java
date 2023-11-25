package dependecyInjection.cellInjection;

import java.util.Arrays;

public class Cell {
    private String model;
    private Battery battery;
    private int nroChips;
    private Chip[] chips;

    /*
    sin injection:
        cada vez que bateria cambie tendremos que cambiar tambien aqui
      public Cell(String model,int mAh,String fechaFabricacion,String marca){
        this.model = model;
        this.battery = new Battery(mAh,marca,fechaFabricacion);
        this.chips = new Chip[2];
    }

     */

    //con Ingection
    public Cell(String model,Battery battery){
        this.model = model;
        this.battery = battery;
        this.chips = new Chip[2];
    }

    @Override
    public String toString() {
        return "Cell{" +
                "model='" + model + '\'' +
                ", battery=" + battery.toString() +
                ", nroChips=" + nroChips +
                ", chips=" + Arrays.toString(chips) +
                '}';
    }

    public void agregarChip(Chip nuevoChip){
        if( nroChips <2){
            chips[nroChips]= nuevoChip;
            nroChips++;
        }
    }
}
