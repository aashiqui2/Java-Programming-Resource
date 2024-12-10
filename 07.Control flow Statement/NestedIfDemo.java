public class NestedIfDemo {
    public static void main(String[] args) {
        int age = 25;
        boolean hasVoterID = true;

        if (age >= 18) {
            if (hasVoterID) {
                System.out.println("You are eligible to vote.");
            } else {
                System.out.println("You need a voter ID to vote.");
            }
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
}
