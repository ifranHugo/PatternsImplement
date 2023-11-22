package state.ConectionMessagesSolution;

public class Cerrado implements State{
    private Context context = new Context();
    @Override
    public void abrir() {

        this.context.setState(new Preparado());
    }

    @Override
    public void cerrar() {

    }

    @Override
    public void parar() {
        throw new UnsupportedOperationException("Accion no permitida,esta intentando parar y esta cerrado... ");
    }

    @Override
    public void iniciar() {
        throw new UnsupportedOperationException("Accion no permitida, esta intentando iniciar y esta cerrado... ");

    }

    @Override
    public void enviar(String msg) {
        throw new UnsupportedOperationException("Accion no permitida, cerrado... ");
    }

    @Override
    public void recibir(int respuesta) {
        throw new UnsupportedOperationException("Accion no permitida, cerrado... ");
    }

    @Override
    public void setState(Context context) {
        this.context= context;
    }
}
