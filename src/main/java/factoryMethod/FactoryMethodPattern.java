package factoryMethod;

public class FactoryMethodPattern {

        private Payment payment;
        private final PaymentService service;


        public FactoryMethodPattern(){
                //make a payment with bank deposit

                service = PaymentService.getPaymentserviceinstance();
                payment = service.choosePayment(PaymentType.BANCK_DEPOSIT);
                payment.configurePayment("CAXA1435234334", 3000);

                if (payment.isMakePayment()) payment.getTicket();

                payment = service.choosePayment(PaymentType.MERCADO_PAGO);
                payment.configurePayment("94194 190390",48824);
                if (payment.isMakePayment()) payment.getTicket();

        }


        public static void main(String[] args) {
                new FactoryMethodPattern();
        }
}
