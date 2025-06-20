package secao16.interfaces5.services;

public class UsaInterestService implements IInterestService {
    private final double interestRate;

    public UsaInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }
}
