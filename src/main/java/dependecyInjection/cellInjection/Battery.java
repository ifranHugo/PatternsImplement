package dependecyInjection.cellInjection;

public class Battery {
    private int mAh;
    private String marca;

    //ahora hacemos cambios en battery como agregar año de fabricacion
    private String yearManufacture;
    public Battery(int mAh,String marca,String yearManufacture){
        this.mAh = mAh;
        this.marca = marca;
        this.yearManufacture = yearManufacture;
    }

    @Override
    public String toString() {
        return "Battery{" +
                "mAh=" + mAh +
                ", marca='" + marca + '\'' +
                ", yearManufacture='" + yearManufacture + '\'' +
                '}';
    }
}
