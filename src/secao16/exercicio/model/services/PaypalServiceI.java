package secao16.exercicio.model.services;

public class PaypalServiceI implements IOnlinePaymentService {
    private static final double FEE_PERCENTAGE = 0.02;
    private static final double MONTHLY_INTEREST = 0.01;

    @Override
    public Double paymentFee(Double amount) {
        return amount * FEE_PERCENTAGE;
    }

    @Override
    public Double interest(Double amount, Integer months) {
        return amount * MONTHLY_INTEREST * months;
    }
}
