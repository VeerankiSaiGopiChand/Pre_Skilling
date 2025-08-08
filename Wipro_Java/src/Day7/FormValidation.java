package Day7;

import java.util.Scanner;

public class FormValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        String ageInput = sc.nextLine(); 

        try {
            int age = Integer.parseInt(ageInput); 
            if (age > 0) {
                System.out.println("Valid age: " + age);
            } else {
                System.out.println("Age must be positive.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a numeric age.");
        }

        sc.close();
    }
}
