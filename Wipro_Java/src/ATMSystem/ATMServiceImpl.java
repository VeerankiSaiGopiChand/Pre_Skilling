package ATMSystem;

public class ATMServiceImpl implements ATMService {

    private User[] users;

    public ATMServiceImpl() {
        users = new User[]{
            new User(1, 2024, 7777),
            new User(2, 2025, 10000),
            new User(3, 2026, 9989)
        };
    }

    @Override
    public User login(int accNo, int pin) throws InvalidPinException {
        for (User u : users) {
            if (u.getAccountNumber() == accNo && u.getPin() == pin) {
                return u;
            }
        }
        throw new InvalidPinException("Invalid account number or PIN.");
    }

    @Override
    public void checkBalance(User user) {
        System.out.println("Current Balance: ₹" + user.getBalance());
    }

    @Override
    public void deposit(User user, double amount) {
        if (amount > 0) {
            user.deposit(amount);
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    @Override
    public void withdraw(User user, double amount) throws InsufficientBalanceException {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }

        if (user.getBalance() >= amount) {
            user.withdraw(amount);
            System.out.println("₹" + amount + " withdrawn successfully.");
        } else {
            throw new InsufficientBalanceException("Insufficient balance.");
        }
    }
}
