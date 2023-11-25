package Observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectMoney {

    private List<ObserverMoney> Observers = new ArrayList<>();
    private double estado;

    public double getEstado() {
        return estado;
    }

    public void setEstado(double estado) {
        this.estado = estado;
        notificarTodos();
    }

    public void agregar(ObserverMoney observer) {
        Observers.add(observer);
    }

    public void notificarTodos() {
        Observers.forEach(observer -> observer.actualizar());
    }
}
