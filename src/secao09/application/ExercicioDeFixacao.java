package secao09.application;

import secao09.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDeFixacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        int accountNumber;
        String accountHolder, hasDeposit;
        double initialDeposit, deposit, withdraw;

        System.out.print("Enter account number: ");
        accountNumber = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        accountHolder = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        hasDeposit = sc.nextLine().toLowerCase();

        // melhorar verificação //
        if (hasDeposit.equals("y")) {
            System.out.print("Enter initial deposit value: ");
            initialDeposit = sc.nextDouble();
            account = new Account(accountHolder, accountNumber, initialDeposit);
        } else {
            account = new Account(accountHolder, accountNumber);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);
        System.out.println();

        System.out.print("Enter a deposit value: ");
        deposit = sc.nextDouble();
        account.deposit(deposit);
        System.out.println();

        System.out.println("Updated account data: ");
        System.out.println(account);
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        withdraw = sc.nextDouble();
        account.withdraw(withdraw);
        System.out.print(account);
        System.out.println();

        sc.close();
    }
}
