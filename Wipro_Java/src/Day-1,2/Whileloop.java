import java.util.Scanner;

public class Whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Use Case-1(Hospital Patient Check: Wait Until Heart Rate Normal)
		int heartRate = 130;

		while (heartRate > 100) {
		    System.out.println("Heart rate high: " + heartRate);
		    heartRate -= 5;
		}
		System.out.println("Heart rate is normal.");

		//Use Case-2(Music Player Keeps Playing Until Song Ends)
		int songDuration = 5; // in minutes

		while (songDuration > 0) {
		    System.out.println("Playing... " + songDuration + " minutes left");
		    songDuration--;
		}
		System.out.println("Song ended.");

		//Use Case-3(Continue deleting unwanted files until none are left)
		int junkFiles = 3;

		while (junkFiles > 0) {
		    System.out.println("Deleting file " + junkFiles);
		    junkFiles--;
		}
		System.out.println("Cleanup complete.");

		//Use Case-4(Keep prompting the user until the correct PIN is entered or attempts exceed 3)
		
	    Scanner sc = new Scanner(System.in);
        int correctPIN = 1234;
        int attempts = 0;
        int enteredPIN;

        while (attempts < 3) {
            System.out.print("Enter PIN: ");
            enteredPIN = sc.nextInt();
            attempts++;

            if (enteredPIN == correctPIN) {
                System.out.println("Access Granted");
                break;
            } else {
                System.out.println("Incorrect PIN");
            }

            if (attempts == 3) {
                System.out.println("Card Blocked");
            }
        }
        
    
      sc.close();
	}
	

}
