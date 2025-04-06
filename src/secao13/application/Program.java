package secao13.application;

import secao13.entities.Account;
import secao13.entities.BusinessAccount;
import secao13.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        //        Account acc = new Account(1001, "Alex", 0.0);
        //        BusinessAccount bacc =
        //                new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // ! UPCASTING ! //

        //        Account acc1 = bacc;
        //        Account acc2 =
        //                new BusinessAccount(1003, "Bob", 0.0, 200.0);
        //        Account acc3 =
        //                new SavingsAccount(1004, "Anna", 0.0, 0.01);

        // ! DOWNCASTING ! //

        //        BusinessAccount acc4 = (BusinessAccount) acc2;
        //        acc4.loan(100.0);

        // BusinessAccount acc5 = (BusinessAccount)acc3;
        //        if (acc3 instanceof BusinessAccount) {
        //            BusinessAccount acc5 = (BusinessAccount) acc3;
        //            acc5.loan(200.0);
        //            System.out.println("Loan!");
        //        }
        //
        //        if (acc3 instanceof SavingsAccount) {
        //            SavingsAccount acc5 = (SavingsAccount) acc3;
        //            acc5.updateBalance();
        //            System.out.println("Update!");
        //        }

        // ! OVERRIDE ! //

        //        Account acc5 = new Account(1001, "Alex", 1000.0);
        //        acc5.withdraw(200.0);
        //        System.out.println(acc5.getBalance());
        //
        //        Account acc6 =
        //                new SavingsAccount(1002, "Maria", 1000.0, 0.1);
        //        acc6.withdraw(200.0);
        //        System.out.println(acc6.getBalance());
        //
        //        Account acc7 =
        //                new BusinessAccount(1003, "Joao", 1000.0, 500.0);
        //        acc7.withdraw(200.0);
        //        System.out.println(acc7.getBalance());

        // ! POLIMORFISMO ! //

        //        Account x =
        //                new Account(1020, "Alex", 1000.0);
        //        Account y =
        //                new SavingsAccount(1023, "Maria", 1000.0, 0.01);
        //
        //        x.withdraw(50.0);
        //        y.withdraw(50.0);
        //
        //        System.out.println(x.getBalance());
        //        System.out.println(y.getBalance());

        // ! CLASSES ABSTRATAS ! //

        //        Account acc1 = new Account(1001, "Alex", 1000.0);
        //        Account acc2 = new SavingsAccount(
        //                1002,
        //                "Maria",
        //                1000.0,
        //                0.01
        //        );
        //        Account acc3 = new BusinessAccount(
        //                1003,
        //                "Bob",
        //                1000.0,
        //                500.0
        //        );

        List<Account> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount(
                1001,
                "Alex",
                500.00,
                0.01
        ));
        accounts.add(new BusinessAccount(
                1002,
                "Maria",
                1000.0,
                400.0
        ));
        accounts.add(new SavingsAccount(
                1004,
                "Bob",
                300.0,
                0.01
        ));
        accounts.add(new BusinessAccount(
                1005,
                "Anna",
                500.0,
                500.0
        ));

        double sum = 0.0;
        for (Account account : accounts) {
            sum += account.getBalance();
        }
        System.out.printf("Total balance: %.2f%n", sum);

        for (Account account : accounts) {
            account.deposit(10.0);
            System.out.printf(
                    "Updated balance for account %d: %.2f%n",
                    account.getNumber(),
                    account.getBalance()
            );
        }
    }
}
