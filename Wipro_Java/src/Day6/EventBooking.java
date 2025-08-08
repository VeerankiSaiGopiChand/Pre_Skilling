package Day6;

import java.util.Scanner;

class InvalidEventCodeException extends Exception {
    public InvalidEventCodeException(String message) {
        super(message);
    }
}

public class EventBooking {

    static final String VALID_EVENT_CODE = "OP2025";

    
    static void validateEventCode(String enteredCode) throws InvalidEventCodeException {
        if (!enteredCode.equals(VALID_EVENT_CODE)) {
            throw new InvalidEventCodeException("Invalid Event Code! Please check and try again.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println(" Welcome to Event Booking Portal");
            System.out.print("Enter the event code to book your ticket: ");
            String userCode = sc.nextLine();

            validateEventCode(userCode);

            System.out.println("Event Code Verified! Ticket booked successfully.");
            System.out.println("Confirmation email has been sent to your registered email.");

        } catch (InvalidEventCodeException e) {
            System.out.println("Booking Failed: " + e.getMessage());
        } finally {
            System.out.println("Booking session ended. Thank you for using our service!");
            sc.close();
        }
    }
}

