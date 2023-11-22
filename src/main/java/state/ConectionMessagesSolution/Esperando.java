package state.ConectionMessagesSolution;

public class Esperando implements State{
    protected Context context = new Context();
    @Override
    public void abrir() {
        throw new UnsupportedOperationException("esta esperando... ");
    }

    @Override
    public void cerrar() {
        throw new UnsupportedOperationException("Accion no permitida,esta esperando... ");

    }

    @Override
    public void parar() {
        throw new UnsupportedOperationException("Accion no permitida... ");

    }

    @Override
    public void iniciar() {

    }

    @Override
    public void enviar(String msg) {
        throw new UnsupportedOperationException("Accion no permitida... ");
    }

    @Override
    public void recibir(int respuesta) {
        if (respuesta==0){
            this.context.setState(new Preparado());
        }else {
            this.context.setState(new Cerrado());
        }
    }
    @Override
    public void setState(Context context) {
        this.context=context;
    }
}
