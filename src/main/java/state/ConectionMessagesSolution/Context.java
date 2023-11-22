package state.ConectionMessagesSolution;

import state.ConectionMessages.Link;

public class Context {

    private State state;

    protected Link link;
    public Context(Link link){
        //assert link t= null;
        this.link = link;
        this.setState(new Cerrado());
    }
    public Context(){

    }
    public State getEstado(){
        return this.state;
    }
    protected void setState(State state){
        this.state=state;
        System.out.print(this.state);
    }
    public void abrir(){
        this.state.abrir();
    }
    public void cerrar(){
        this.state.cerrar();
    }
    public void parar(){
        this.state.parar();
    }
    public void iniciar(){
        this.state.iniciar();
    }

    public void enviar(String msg){
        this.state.enviar(msg);
    }

    public void recibir(int respuesta){
        this.state.recibir(respuesta);
    }

}

