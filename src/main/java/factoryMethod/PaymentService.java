package factoryMethod;

import java.util.Objects;

public final class PaymentService {

    private  static PaymentService factoryinstance;

    private  PaymentService(){}

    public static PaymentService getPaymentserviceinstance(){
        factoryinstance = Objects.isNull(factoryinstance) ? new PaymentService() :factoryinstance;
        return factoryinstance;
    }

    public Payment choosePayment(PaymentType paymentType){
        return paymentType.payment;
    };
}
