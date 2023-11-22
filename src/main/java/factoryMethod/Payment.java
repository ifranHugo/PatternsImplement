package factoryMethod;

public interface Payment {
    String SUCCES = "Successful payment";
    String ERROR ="Payment coul not be made";

    void configurePayment(String varible, int quantity);

    boolean isMakePayment();


    void getTicket();
}
