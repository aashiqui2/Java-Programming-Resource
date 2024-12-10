public class ReturnDemo {
    public static void main(String[] args) {
        System.out.println("Before return");
        if (true) {
            return; // Exit the method
        }
        System.out.println("This won't be printed");
    }
}
