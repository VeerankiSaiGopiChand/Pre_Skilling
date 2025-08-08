package Day3;

import java.util.Scanner;

abstract class Remote {
    abstract void turnOn();
    abstract void turnOff();
}

class TvRemote extends Remote {
    void turnOn() {
        System.out.println("TV is turned ON");
    }

    void turnOff() {
        System.out.println("TV is turned OFF");
    }
}

class AcRemote extends Remote {
    void turnOn() {
        System.out.println("AC is turned ON");
    }

    void turnOff() {
        System.out.println("AC is turned OFF");
    }
}

public class TvAc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String device = scanner.nextLine().toLowerCase();

        Remote r;

        if (device.equals("tv")) {
            r = new TvRemote();
        } else if (device.equals("ac")) {
            r = new AcRemote();
        } else {
            System.out.println("Invalid device");
            scanner.close();
            return;
        }

        r.turnOn();
        r.turnOff();

        scanner.close();
    }
}

