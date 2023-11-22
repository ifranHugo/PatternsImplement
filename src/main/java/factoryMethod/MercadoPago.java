package factoryMethod;

public class MercadoPago extends AbstractPayment{
    private static final String TICKET_MESSAGE ="a ingresado un deposito a mercado pago";
    private static final String TICKET_NAME="mercadopago.txt";

    public MercadoPago() {
        super();
        setTicketmessage(TICKET_MESSAGE);
        setTicketName(TICKET_NAME);
    }

    @Override
    protected boolean checkDatabase() {
        switch (variable){
            case "93499 12993":
                message=SUCCES;
                return true;
            case "94194 190390":
                message = SUCCES;
                return true;
            default:
                message =ERROR;
                return false;
        }
    }
}
