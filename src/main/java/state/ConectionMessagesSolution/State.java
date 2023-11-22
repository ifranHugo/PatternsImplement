package state.ConectionMessagesSolution;

public interface State {

    void abrir();

    void cerrar();

    void parar();

    void iniciar();

    void enviar(String msg);

    void recibir(int respuesta);

    void setState(Context context);



}
