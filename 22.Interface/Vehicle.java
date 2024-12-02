public interface Vehicle {
    void start();        // abstract method
    void stop();
    
    default void honk() {   // default method with an implementation
        System.out.println("Honking...");
    }
    
    static void service() { // static method
        System.out.println("Service in progress...");
    }
}
