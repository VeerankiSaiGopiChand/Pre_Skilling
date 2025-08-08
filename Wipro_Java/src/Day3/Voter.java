package Day3;

public class Voter {
    private String name;
    private String id;
    private boolean hasVoted;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void vote() {
        if (!hasVoted) {
            hasVoted = true;
            System.out.println(name + " has voted.");
        } else {
            System.out.println(name + " has already voted.");
        }
    }

    public boolean getVoteStatus() {
        return hasVoted;
    }
}
