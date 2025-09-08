package Day3;

public class VotingApp {
    public static void main(String[] args) {
        Voter v1 = new Voter();
        v1.setName("Anil");
        v1.setId("V123");

        v1.vote();
        v1.vote();  

        System.out.println("Voter ID: " + v1.getId());
        System.out.println("Vote Done: " + v1.getVoteStatus());
    }
}
