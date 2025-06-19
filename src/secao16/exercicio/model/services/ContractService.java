package secao16.exercicio.model.services;

import secao16.exercicio.model.entities.Contract;
import secao16.exercicio.model.entities.Installment;

import java.time.LocalDate;

public class ContractService {
    private final IOnlinePaymentService IOnlinePaymentService;

    public ContractService(IOnlinePaymentService IOnlinePaymentService) {
        this.IOnlinePaymentService = IOnlinePaymentService;
    }

    public void processContract(Contract contract, Integer months) {
        double basicQuota = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);
            double interest = IOnlinePaymentService.interest(basicQuota, i);
            double fee = IOnlinePaymentService.paymentFee(basicQuota + interest);
            double quota = basicQuota + interest + fee;
            contract.getInstallment().add(new Installment(quota, dueDate));
        }
    }
}
