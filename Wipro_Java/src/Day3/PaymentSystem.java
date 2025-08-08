package Day3;

abstract class Payment {
    abstract void pay(double amount);
}

class CreditCardPayment extends Payment {
    String cardNumber;

    CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card: " + cardNumber);
    }
}

class UPIPayment extends Payment {
    String upiId;

    UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via UPI ID: " + upiId);
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        Payment payment1 = new CreditCardPayment("12345678");
        Payment payment2 = new UPIPayment("gopi@upi");

        payment1.pay(999.99);
        payment2.pay(250.50);
    }
}
