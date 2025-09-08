package Day3;

public class VoterScanner {
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
