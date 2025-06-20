package secao16.interfaces5.services;

public class BrazilInterestService implements IInterestService {
    private final double interestRate;

    public BrazilInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }
}
