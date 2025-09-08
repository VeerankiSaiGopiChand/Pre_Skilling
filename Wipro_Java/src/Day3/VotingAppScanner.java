package Day3;

import java.util.Scanner;

public class VotingAppScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VoterS v = new VoterS();

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        v.set_name(name);

        System.out.print("Enter your voter ID: ");
        String id = sc.nextLine();
        v.set_id(id);

        v.vote();

        System.out.print("Do you want to vote again? (yes/no): ");
        String again = sc.nextLine();

        if (again.equalsIgnoreCase("yes")) {
            v.vote();
        }

        System.out.println("Voter Name: " + v.get_name());
        System.out.println("Voter ID: " + v.get_id());
        System.out.println("Vote Done: " + v.is_voted());

        sc.close();
    }
}

class VoterS {
    private String name;
    private String id;
    private boolean voted;

    public void set_name(String name) {
        this.name = name;
    }

    public String get_name() {
        return name;
    }

    public void set_id(String id) {
        this.id = id;
    }

    public String get_id() {
        return id;
    }

    public boolean is_voted() {
        return voted;
    }

    public void vote() {
        if (!voted) {
            voted = true;
            System.out.println(name + " has voted.");
        } else {
            System.out.println(name + " has already voted.");
        }
    }
}
