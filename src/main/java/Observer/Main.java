package Observer;

import java.util.Scanner;

public class Main {
    public void changeValueMoney(SubjectMoney subject){

    }

    public static void main(String[] args) {
        SubjectMoney subject  = new SubjectMoney();

        new PesosChilenosObserver(subject);
        new PesosArgentinosObserver(subject);
        new PesosUruguayosObserver(subject);

        System.out.println("Cuantos dolares qusieras cambiar?");
        Scanner scanner = new Scanner(System.in);
        double Cambiar=scanner.nextDouble();
        subject.setEstado(Cambiar);

    }
}
