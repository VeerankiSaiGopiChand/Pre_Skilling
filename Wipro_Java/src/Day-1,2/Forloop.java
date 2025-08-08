
public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Use Case-1(Finding the Maximum Temperature in a Week)
		int[] temps = {34, 36, 38, 33, 37, 39, 35};
		int maxTemp = temps[0];

		for (int i = 1; i < temps.length; i++) {
		    if (temps[i] > maxTemp) {
		        maxTemp = temps[i];
		    }
		}
		System.out.println("Max temperature: " + maxTemp + "°C");

		//Use Case-2(Counting the Number of Steps You Walked in a Week)
		int[] steps = {3000, 4000, 2500, 3500, 5000, 4200, 3800};
		int total = 0;

		for (int i = 0; i < steps.length; i++) {
		    total += steps[i];
		}
		System.out.println("Total steps in the week: " + total);

		//Use Case-3(Displaying Items in a Shopping Cart)
		String[] cart = {"Shoes", "T-shirt", "Watch"};

		for (int i = 0; i < cart.length; i++) {
		    System.out.println("Item " + (i+1) + ": " + cart[i]);
		}

		//Use Case-4(A system sends emails to a list of registered users)
		String[] emails = {"user1@gmail.com", "user2@gmail.com", "user3@gmail.com"};

		for (int i = 0; i < emails.length; i++) {
		    System.out.println("Sending email to: " + emails[i]);
		}

		//Use Case-5(Checking Software Update Status)
		String[] apps = {"Chrome", "VS Code", "Zoom"};

		for (int i = 0; i < apps.length; i++) {
		    System.out.println("Checking update for: " + apps[i]);
		}

	}

}
