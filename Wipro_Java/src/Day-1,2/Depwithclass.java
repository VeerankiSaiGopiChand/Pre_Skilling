import java.util.Scanner;

class Bank {
    String name;
    double bal;

    void set(String n, double b) {
        name = n;
        bal = b;
    }

    void dep(double a) { bal += a; }

    void wit(double a) {
        if (a <= bal) bal -= a;
        else System.out.println("No Balance");
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Balance: " + bal);
    }
}

public class Depwithclass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Bank b = new Bank();

        String n = s.nextLine();
        double bal = s.nextDouble();
        b.set(n, bal);

        double dep = s.nextDouble();
        b.dep(dep);

        double wit = s.nextDouble();
        b.wit(wit);

        b.show();
        
        s.close();
    }
}



