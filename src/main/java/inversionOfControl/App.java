package inversionOfControl;

public class App {

    public static void main(String[] args) {
        UsuarioFactory obj1= new UsuarioFactory(new UsuarioImplOracle());
        UsuarioFactory obj2= new UsuarioFactory(new UsuarioImplOracle());

        obj1.getInsertaUsuario(1);
        obj2.getInsertaUsuario(2);
        obj1.getEliminarUsuariById(1);
    }
}
