package Day7;

import java.util.HashMap;
import java.util.Scanner;

public class ScoreBoard {
    public static void main(String[] args) {
        HashMap<String, Integer> scoreboard = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter player name: ");
            String name = sc.nextLine();

            System.out.print("Enter score for " + name + ": ");
            int score = sc.nextInt();
            sc.nextLine(); 

            scoreboard.put(name, score);
        }

        System.out.println("\nScoreboard:");
        String topScorer = null;
        int highestScore = Integer.MIN_VALUE;

        for (String player : scoreboard.keySet()) {
            int score = scoreboard.get(player);
            System.out.println(player + ": " + score + " points");

            if (score > highestScore) {
                highestScore = score;
                topScorer = player;
            }
        }

        if (topScorer != null) {
            System.out.println("\nTop Scorer: " + topScorer + " with " + highestScore + " points");
        }

        sc.close();
    }
}
