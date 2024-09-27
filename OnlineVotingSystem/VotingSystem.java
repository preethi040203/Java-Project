import java.util.Scanner;

public class VotingSystem {
    private static final int TOTAL_CANDIDATES = 3;
    private static Candidate[] candidates = new Candidate[TOTAL_CANDIDATES];

    public static void main(String[] args)throws Exception {
        initializeCandidates();

        Scanner scanner = new Scanner(System.in);
       Thread.sleep(2000);
        while (true) {
            System.out.println("\n===== Online Voting System =====");
            System.out.println("1. Cast Vote");
            System.out.println("2. View Results");
            System.out.println("3. Exit");
            Thread.sleep(1000);
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    castVote(scanner);
                    break;
                case 2:
                    displayResults();
                    break;
                case 3:
                Thread.sleep(1000);
                    System.out.println("Exiting the system...");
                    scanner.close();
                    System.exit(0);
                default:
                Thread.sleep(1000);
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    private static void initializeCandidates() {
        candidates[0] = new Candidate("John Doe");
        candidates[1] = new Candidate("Jane Smith");
        candidates[2] = new Candidate("Alice Johnson");
    }

    private static void castVote(Scanner scanner) {
        System.out.print("Enter your voter ID: ");
        String voterId = scanner.next();

        if (Voter.hasVoted(voterId)) {

            System.out.println("You have already voted!");
            return;
        }
       
        System.out.println("\n--- Candidates ---");
        for (int i = 0; i < TOTAL_CANDIDATES; i++) {
            System.out.println((i + 1) + ". " + candidates[i].getName());
        }
       
        System.out.print("Choose your candidate (1-" + TOTAL_CANDIDATES + "): ");
        int candidateChoice = scanner.nextInt();

        if (candidateChoice < 1 || candidateChoice > TOTAL_CANDIDATES) {
            
            System.out.println("****************************************Invalid choice. Try again.****************************************");
            return;
        }


        candidates[candidateChoice - 1].addVote();
        Voter.markVoted(voterId);
        
        System.out.println("Vote cast successfully!");
    }

    private static void displayResults() {
        
        System.out.println("\n===== Voting Results =====");
        for (Candidate candidate : candidates) {
            System.out.println(candidate.getName() + ": " + candidate.getVotes() + " votes");
        }
    }
}
