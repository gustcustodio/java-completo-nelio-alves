package secao14.challenge;

import secao14.challenge.model.entities.Account;
import secao14.challenge.model.exceptions.BusinessException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the account data: ");
        System.out.print("Number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Holder: ");
        String holder = sc.nextLine();
        System.out.print("Initial balance: ");
        double initialBalance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();

        Account account = new Account(number, holder, initialBalance, withdrawLimit);

        try {
            System.out.print("\nEnter amount for withdraw: ");
            double amountWithdraw = sc.nextDouble();
            account.withdraw(amountWithdraw);
            System.out.printf("New balance: %.2f ", account.getBalance());
        } catch (BusinessException exception) {
            System.out.print("Withdraw error: " + exception.getMessage());
        }

        sc.close();
    }
}
