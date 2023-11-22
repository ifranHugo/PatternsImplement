package factoryMethod;

public class BankDeposit extends AbstractPayment{

    private static final String TICKET_MESSAGE ="Ha efectuado el deposito correctamente";
    private static final String TICKET_NAME="bankdeposit.txt";

    public BankDeposit() {
        super();
        setTicketmessage(TICKET_MESSAGE);
        setTicketName(TICKET_NAME);
    }

    @Override
    protected boolean checkDatabase() {
        switch (variable){
            case "CAXA1435234334":
                message=SUCCES;
                return true;
            case "SAN48293924224":
                message = SUCCES;
                return true;
            default:
                message =ERROR;
                return false;
        }
    }

}
