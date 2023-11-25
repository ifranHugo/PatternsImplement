package Observer;

public class PesosChilenosObserver implements ObserverMoney{

    private double valorCambio = 871.70;
    private SubjectMoney subject;


    public PesosChilenosObserver(SubjectMoney subject){
        this.subject= subject;
        this.subject.agregar(this);
    }

    @Override
    public void actualizar() {
        System.out.println("Pesos Chilenos: " + (subject.getEstado() * valorCambio));
    }

}
