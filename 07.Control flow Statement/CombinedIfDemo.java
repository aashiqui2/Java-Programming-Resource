public class CombinedIfDemo {
    public static void main(String[] args) {
        int number = 15;

        if (number > 0) {
            System.out.println("The number is positive.");

            if (number % 2 == 0) {
                System.out.println("It is an even number.");
            } else {
                System.out.println("It is an odd number.");
            }
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
