package inversionOfControl;

public class UsuarioImplMongo implements UsuarioInterface{

    @Override
    public void insertaUsuario(int id) {
        System.out.println("Insertando usuario en Mongo");
    }

    @Override
    public void eliminaUsuarioById(int id) {
        System.out.println("eliminando usuario en Mongo");

    }
}
