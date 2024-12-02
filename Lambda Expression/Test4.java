public class Test4 {
    public static void main(String[] args) {
        // ! anonymous class--with lambda
        Thread t = new Thread(
                () -> {
                    for (int i = 1; i <= 5; i++) {
                        System.out.println("Child thread " + i);
                    }
                });
        t.start();
    }
}
