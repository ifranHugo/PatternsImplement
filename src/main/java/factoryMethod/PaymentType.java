package factoryMethod;

public enum PaymentType {
    BANCK_DEPOSIT(new BankDeposit()),
    MERCADO_PAGO(new MercadoPago());

    protected Payment payment;

    PaymentType(Payment payment ){
        this.payment = payment;
    }
}
