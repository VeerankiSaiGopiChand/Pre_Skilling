package ATMSystem;

public interface ATMService {
    User login(int accNo, int pin) throws InvalidPinException;
    void checkBalance(User user);
    void deposit(User user, double amount);
    void withdraw(User user, double amount) throws InsufficientBalanceException;
}
