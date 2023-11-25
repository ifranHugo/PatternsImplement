package Observer;

public class PesosArgentinosObserver implements ObserverMoney{

    private double valorCambio = 1000;
    private SubjectMoney subject;

    public PesosArgentinosObserver(SubjectMoney subject) {
        this.subject = subject;
        this.subject.agregar(this);
    }
    @Override
    public void actualizar() {
        System.out.println("Pesos Argentinos: " + (subject.getEstado() * valorCambio));
    }
}
