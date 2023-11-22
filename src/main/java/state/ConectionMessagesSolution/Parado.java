package state.ConectionMessagesSolution;

public class Parado implements State{

    protected Context context = new Context();
    @Override
    public void abrir() {
        throw new UnsupportedOperationException("Accion no permitida, ya a sido habierto esta esperando... ");
    }

    @Override
    public void cerrar() {
        throw new UnsupportedOperationException("Accion no permitida, esta parado... ");
    }

    @Override
    public void parar() {
        throw new UnsupportedOperationException("ya esta parado... ");
    }

    @Override
    public void iniciar() {
        this.context.setState( new Preparado());

    }

    @Override
    public void enviar(String msg) {
        throw new UnsupportedOperationException("Accion no permitida, esta parado... ");

    }

    @Override
    public void recibir(int respuesta) {
        throw new UnsupportedOperationException("Accion no permitida, esta parado... ");
    }

    @Override
    public void setState(Context context) {
        this.context =context;
    }
}
