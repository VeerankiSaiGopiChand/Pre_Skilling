import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int atms = 3;
        int days = 7;
        int[][] transactions = new int[atms][days];

        System.out.println("Enter ATM transactions (₹) for 3 ATMs over 7 days:");
        System.out.println("(Positive = Deposit, Negative = Withdrawal, 0 = No transaction)");

        for (int i = 0; i < atms; i++) {
            System.out.println("ATM " + (i + 1) + ":");
            for (int j = 0; j < days; j++) {
                transactions[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nATM Weekly Summary:");
        for (int i = 0; i < atms; i++) {
            int total = 0;
            System.out.print("ATM " + (i + 1) + ": ");
            for (int j = 0; j < days; j++) {
                System.out.print(transactions[i][j] + " ");
                total += transactions[i][j];
            }
            System.out.println("| Net Change: ₹" + total);
        }
        sc.close();

	}

}
