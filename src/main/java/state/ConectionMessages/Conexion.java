package state.ConectionMessages;


/*ejemplo de codigo spaguetii para luego resolverlo*/
public class Conexion {
    private Link link;
    private Estado estado;

    public Conexion(Link link){
        //assert link t= null;
        this.link = link;
        this.estado =Estado.CERRADO;
    }
    public Estado getEstado(){
        return this.estado;
    }

    public void abrir(){
        if(this.estado==Estado.CERRADO){
            this.estado=Estado.PREPARADO;
        } else if (this.estado==Estado.PARADO) {
            throw new UnsupportedOperationException("Accion no permitida... ");
        } else if (this.estado==Estado.PREPARADO) {
        } else if (this.estado==Estado.ESPERANDO) {
            throw new UnsupportedOperationException("Accion no permitida... ");
        }else
            assert false:"Estado imposible";
    }
    public void cerrar(){
        if(this.estado==Estado.CERRADO){
        } else if (this.estado==Estado.PARADO) {
            throw new UnsupportedOperationException("Accion no permitida... ");
        } else if (this.estado==Estado.PREPARADO) {
            this.estado=Estado.CERRADO;
        } else if (this.estado==Estado.ESPERANDO) {
            throw new UnsupportedOperationException("Accion no permitida... ");
        }else
            assert false:"Estado imposible";
    }
    public void parar(){
        if(this.estado==Estado.CERRADO){
            throw new UnsupportedOperationException("Accion no permitida... ");
        } else if (this.estado==Estado.PARADO) {
        } else if (this.estado==Estado.PREPARADO) {
            this.estado=Estado.PARADO;
        } else if (this.estado==Estado.ESPERANDO) {
            throw new UnsupportedOperationException("Accion no permitida... ");
        }else
            assert false:"Estado imposible";
    }
    public void iniciar(){
        if(this.estado==Estado.CERRADO){
            throw new UnsupportedOperationException("Accion no permitida... ");
        } else if (this.estado==Estado.PARADO) {
            this.estado=Estado.PREPARADO;
        } else if (this.estado==Estado.PREPARADO) {
        } else if (this.estado==Estado.ESPERANDO) {
            throw new UnsupportedOperationException("Accion no permitida... ");
        }else
            assert false:"Estado imposible";
    }

    public void enviar(String msg){
        if(this.estado==Estado.CERRADO){
            throw new UnsupportedOperationException("Accion no permitida... ");
        } else if (this.estado==Estado.PARADO) {
            throw new UnsupportedOperationException("Accion no permitida... ");
        } else if (this.estado==Estado.PREPARADO) {
            this.link.enviar(msg);
            this.estado = Estado.ESPERANDO;
        } else if (this.estado==Estado.ESPERANDO) {
            throw new UnsupportedOperationException("Accion no permitida... ");
        }else
            assert false:"Estado imposible";
    }
    public void recibir(int respuesta){
        if(this.estado==Estado.CERRADO){
            throw new UnsupportedOperationException("Accion no permitida... ");
        } else if (this.estado==Estado.PARADO) {
            throw new UnsupportedOperationException("Accion no permitida... ");
        } else if (this.estado==Estado.PREPARADO) {
            throw new UnsupportedOperationException("Accion no permitida... ");
        } else if (this.estado==Estado.ESPERANDO) {
            if (respuesta==0){
                this.estado =Estado.PREPARADO;
            }else {
                this.estado=Estado.CERRADO;
            }
        }else
            assert false:"Estado imposible";
    }
}
