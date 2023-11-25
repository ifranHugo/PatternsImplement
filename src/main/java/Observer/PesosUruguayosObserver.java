package Observer;

public class PesosUruguayosObserver implements ObserverMoney{
    public double valorCambio = 39.32;

    public SubjectMoney subject;



    public  PesosUruguayosObserver(SubjectMoney subject){
        this.subject = subject;
        this.subject.agregar(this);
    }
    @Override
    public void actualizar() {
        System.out.println("Pesos Uruguayos: "+ this.subject.getEstado() * valorCambio);
    }
}
