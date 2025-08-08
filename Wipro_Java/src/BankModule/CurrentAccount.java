package BankModule;


public class CurrentAccount extends Account {
    public CurrentAccount(int accNo, String holder, double bal) {
        super(accNo, holder, bal);
    }

    @Override
    public void showAccountType() {
        System.out.println("Current Account for: " + getAccountHolderName());
    }
}
