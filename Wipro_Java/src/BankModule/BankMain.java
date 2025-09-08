package BankModule;



public class BankMain {
    public static void main(String[] args) {
        BankService bank = new BankServiceImpl(5);

        Account acc1 = new SavingsAccount(11, "Luffy", 7000);
        Account acc2 = new CurrentAccount(3, "Zoro", 11000);

        bank.openAccount(acc1);
        bank.openAccount(acc2);

        acc1.deposit(2000);
        acc2.withdraw(5000);

        bank.showAccounts();
    }
}

