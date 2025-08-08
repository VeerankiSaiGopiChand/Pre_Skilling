package ATMSystem;

import java.util.Scanner;

public class ATMApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATMService service = new ATMServiceImpl();

        System.out.println("----- Welcome to the ATM -----");
        int attempts = 0;
        boolean loggedIn = false;
        User currentUser = null;

        while (attempts < 3) {
            try {
                System.out.print("Enter your account number: ");
                int accNo = sc.nextInt();
                System.out.print("Enter your 4-digit PIN: ");
                int pin = sc.nextInt();

                currentUser = service.login(accNo, pin);
                loggedIn = true;
                break;
            } catch (InvalidPinException e) {
                System.out.println("Error: " + e.getMessage());
                attempts++;
                System.out.println("Attempts left: " + (3 - attempts));
            }
        }

        if (!loggedIn) {
            System.out.println("Maximum login attempts exceeded. Exiting...");
            sc.close();
            return;
            
        }

        int choice;
        do {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        service.checkBalance(currentUser);
                        break;
                    case 2:
                        System.out.print("Enter amount to deposit: ");
                        double dep = sc.nextDouble();
                        service.deposit(currentUser, dep);
                        break;
                    case 3:
                        System.out.print("Enter amount to withdraw: ");
                        double wd = sc.nextDouble();
                        service.withdraw(currentUser, wd);
                        break;
                    case 4:
                        System.out.println("Thank you for using the ATM!");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            } catch (InsufficientBalanceException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                System.out.println("-------- Transaction Completed --------");
            }

        } while (choice != 4);

        sc.close();
    }
}
