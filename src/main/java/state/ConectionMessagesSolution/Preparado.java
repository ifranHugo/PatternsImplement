package state.ConectionMessagesSolution;

public class Preparado implements State{
    private Context context = new Context();

    @Override
    public void abrir() {
        throw new UnsupportedOperationException("Accion no permitida, ya esta habierto... ");
    }

    @Override
    public void cerrar() {
        context.setState(new Cerrado());
    }

    @Override
    public void parar() {
        context.setState(new Parado());
    }

    @Override
    public void iniciar() {
        throw new UnsupportedOperationException("Accion no permitida, ya a sido iniciado... ");
    }

    @Override
    public void enviar(String msg) {
        context.link.enviar(msg);
        context.setState(new Esperando());
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
