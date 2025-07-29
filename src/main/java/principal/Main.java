package principal;


import model.Account;
import model.BusinessAccount;
import model.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account(1001, "Alex", 1000.0);
        Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        Account acc3 = new BusinessAccount(1003, "Bom", 1000.0, 500.0);

        acc1.withdraw(200.0);
        acc2.withdraw(200.0);
        acc3.withdraw(200.0);

        System.out.println(acc1.getBalance());
        System.out.println(acc2.getBalance());
        System.out.println(acc3.getBalance());
    }
}