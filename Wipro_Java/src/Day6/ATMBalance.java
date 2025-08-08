package Day6;
import java.util.Scanner;


class InvalidPinExceptionn extends Exception {
    public InvalidPinExceptionn(String message) {
        super(message);
    }
}


 class InsufficientBalanceExceptionn extends Exception {
    public InsufficientBalanceExceptionn(String message) {
        super(message);
    }
}

public class ATMBalance {

    static final int CORRECT_PIN = 2025;
    static double balance = 9999.00;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Insert ATM Card...");
            System.out.print("Enter your 4-digit PIN: ");
            int enteredPin = sc.nextInt();

            if (enteredPin != CORRECT_PIN) {
                throw new InvalidPinExceptionn("Invalid PIN! Access Denied.");
            }

            System.out.println("PIN Verified. Access Granted.");
            System.out.println("Choose an option:\n1. Balance Check\n2. Withdraw");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Your Current Balance: ₹" + balance);
            } 
            else if (choice == 2) {
                System.out.print("Enter amount to withdraw: ₹");
                double withdrawAmount = sc.nextDouble();

                if (withdrawAmount > balance) {
                    throw new InsufficientBalanceExceptionn("Insufficient Balance.");
                } else {
                    balance -= withdrawAmount;
                    System.out.println("Withdrawal Successful. Remaining Balance: ₹" + balance);
                }
            } 
            else {
                System.out.println("Invalid Choice.");
            }

        } catch (InvalidPinExceptionn | InsufficientBalanceExceptionn e) {
            System.out.println("Exception: " + e.getMessage());
        
        } finally {
            System.out.println("Transaction Session Ended. Please remove your card.");
            sc.close();
        }
    }
}
