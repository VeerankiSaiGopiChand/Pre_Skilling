package Day3;

public class Bankapp {
    public static void main(String[] args) {
        Bankaccount account = new Bankaccount();

        account.deposit(10000);
        account.withdraw(3000);
        System.out.println("Balance: ₹" + account.getBalance());

    }
}
