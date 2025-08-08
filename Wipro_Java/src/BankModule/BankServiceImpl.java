package BankModule;

public class BankServiceImpl implements BankService {
    private Account[] accounts;
    private int count;

    public BankServiceImpl(int size) {
        accounts = new Account[size];
        count = 0;
    }

    @Override
    public void openAccount(Account account) {
        if (count < accounts.length) {
            accounts[count++] = account;
            System.out.println("Account opened for: " + account.getAccountHolderName());
        } else {
            System.out.println("Bank account limit reached.");
        }
    }

    @Override
    public void showAccounts() {
        System.out.println("\n--- All Bank Accounts ---");
        for (int i = 0; i < count; i++) {
            Account acc = accounts[i];
            System.out.println("Account No: " + acc.getAccountNumber());
            System.out.println("Holder: " + acc.getAccountHolderName());
            System.out.println("Balance: ₹" + acc.getBalance());
            acc.showAccountType();
            System.out.println("-------------------------");
        }
    }
}
