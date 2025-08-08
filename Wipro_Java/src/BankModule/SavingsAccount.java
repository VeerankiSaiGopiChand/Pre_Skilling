package BankModule;


public class SavingsAccount extends Account {
    public SavingsAccount(int accNo, String holder, double bal) {
        super(accNo, holder, bal);
    }

    @Override
    public void showAccountType() {
        System.out.println("Savings Account for: " + getAccountHolderName());
    }
}
