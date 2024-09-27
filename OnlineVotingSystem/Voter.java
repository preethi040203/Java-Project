import java.util.HashSet;

public class Voter {
    private String voterId;
    private static HashSet<String> votedVoters = new HashSet<>();

    public Voter(String voterId) {
        this.voterId = voterId;
    }

    public String getVoterId() {
        return voterId;
    }

    public static boolean hasVoted(String voterId) {
        return votedVoters.contains(voterId);
    }

    public static void markVoted(String voterId) {
        votedVoters.add(voterId);
    }
}
