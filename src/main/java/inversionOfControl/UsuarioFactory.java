package inversionOfControl;

public class UsuarioFactory {
    UsuarioInterface usr;
    public UsuarioFactory(UsuarioInterface usr){
        this.usr=usr;
    }
    public void getInsertaUsuario(int id){
        usr.insertaUsuario(id);
    }

    public void getEliminarUsuariById(int id){
        usr.eliminaUsuarioById(id);
    }
}
