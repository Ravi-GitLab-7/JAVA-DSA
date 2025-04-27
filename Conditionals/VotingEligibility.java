package Conditionals;

public class VotingEligibility {
    public static void main(String[] args) {
        int age = 20;
        String citizen = "Indian";

        if (age >= 18 && citizen.equals("Indian")) {
            System.out.println("Eligible to vote.");
        } else {
            System.out.println("Not eligible to vote.");
        }
    }
}

