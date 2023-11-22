package factoryMethod;

import java.io.File;
import java.time.LocalDate;
import java.time.LocalTime;

public abstract class AbstractPayment implements Payment {

    protected String variable, message,ticketMessage,ticketName;

    protected  int quantity;
    protected File file;


    protected  AbstractPayment(){}

    @Override
    public void configurePayment(String varible, int quantity) {
        this.variable =varible;
        this.quantity=quantity;
    }

    @Override
    public boolean isMakePayment() {
        var received= checkDatabase();
        System.out.println(message);
        return received;
    }
    protected abstract boolean checkDatabase();

    @Override
    public void getTicket() {
        /*file = new File("src//"+ticketName);
        try (var writer = new FileWriter(file)) {
            writer.write(LocalDate.now()+" :: "+ LocalTime.now() + "\n" + ticketMessage+ "\n Cantidad: "+ quantity+"$");
        }catch ( IOException ex){
            ex.printStackTrace();
        }*/
        System.out.println(LocalDate.now()+" :: "+ LocalTime.now() + "\n" + ticketMessage+ "\n Cantidad: "+ quantity+"$");
    }
    public void setTicketmessage(String ticketmessage){this.ticketMessage = ticketmessage;}

    public void setTicketName(String ticketName){
        this.ticketName = ticketName;
    }
}
