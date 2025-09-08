package FileIOCase;

import java.io.*;
import java.util.Scanner;

// BankAccount class implementing Serializable
class BankAccount implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
    private String accountNumber;
    private double balance;

    public BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount);
        }
    }

    public void displayInfo() {
        System.out.println("\n--- Account Info ---");
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}

public class SerializeBank {
    static final String FILE_NAME = "account_data.ser";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = null;

        // Deserialize if file exists
        File file = new File(FILE_NAME);
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
                account = (BankAccount) ois.readObject();
                System.out.println("✔ Account loaded from file.");
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("❌ Error loading account: " + e.getMessage());
            }
        }

        // If no previous account, create a new one
        if (account == null) {
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter account number: ");
            String accNo = sc.nextLine();
            System.out.print("Enter initial balance: ");
            double bal = sc.nextDouble();
            sc.nextLine(); // clear buffer

            account = new BankAccount(name, accNo, bal);
        }

        // Menu
        boolean exit = false;
        while (!exit) {
            System.out.println("\n=== BANK MENU ===");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Info");
            System.out.println("4. Save and Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    account.deposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    account.withdraw(sc.nextDouble());
                    break;
                case 3:
                    account.displayInfo();
                    break;
                case 4:
                    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
                        oos.writeObject(account);
                        System.out.println("✔ Account saved successfully!");
                    } catch (IOException e) {
                        System.out.println("❌ Error saving account: " + e.getMessage());
                    }
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
