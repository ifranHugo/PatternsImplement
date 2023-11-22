package inversionOfControl;

public class UsuarioImplOracle implements UsuarioInterface{

    private int id;

    @Override
    public void insertaUsuario(int id) {
        System.out.println("Insertando usuario en Oracle: "+id);
    }

    @Override
    public void eliminaUsuarioById(int id ) {
        System.out.println("Eliminando usuario en Oracle: "+id);

    }
}
